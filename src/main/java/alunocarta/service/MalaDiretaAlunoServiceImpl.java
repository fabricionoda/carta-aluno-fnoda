package alunocarta.service;

import alunocarta.model.MalaDiretaAluno;
import alunocarta.thirdservice.email.EmailClient;
import alunocarta.thirdservice.escola.model.Aluno;
import alunocarta.thirdservice.escola.model.Boletim;
import alunocarta.thirdservice.escola.ServicoCadastroClient;
import alunocarta.thirdservice.escola.ServicoNotasClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MalaDiretaAlunoServiceImpl implements MalaDiretaAlunoService {

    public static final BigDecimal MEDIA_NOTA = BigDecimal.valueOf(7);

    @Autowired
    private ServicoCadastroClient servicoCadastroClient;

    @Autowired
    private ServicoNotasClient servicoNotasClient;

    @Autowired
    private EmailClient emailClient;

    public Integer enviarEmailAlunosRiscoReprovacao() {
        List<Boletim> boletins = servicoNotasClient.boletins();
        List<String> cpfAlunosAbaixoMedia = alunosAbaixoMediaEm(boletins);
        List<MalaDiretaAluno> malasDireta = criarMalasDiretaDe(cpfAlunosAbaixoMedia);
        return emailClient.enviar(malasDireta);
    }

    private List<MalaDiretaAluno> criarMalasDiretaDe(List<String> cpfAlunosAbaixoMedia) {
        List<MalaDiretaAluno> malasDireta = new LinkedList<>();
        for (String cpf : cpfAlunosAbaixoMedia) {
            Aluno aluno = servicoCadastroClient.buscaAlunoPorCPF(cpf);
            if (aluno == null)
                continue;
            malasDireta.add(MalaDiretaAluno.of(aluno));
        }
        return malasDireta;
    }

    private List<String> alunosAbaixoMediaEm(List<Boletim> boletins) {
        return boletins.stream()
                .filter(boletim -> boletim
                        .possuiNotaAbaixoDe(MEDIA_NOTA))
                .map(Boletim::getCpf)
                .collect(Collectors.toList());
    }


}
