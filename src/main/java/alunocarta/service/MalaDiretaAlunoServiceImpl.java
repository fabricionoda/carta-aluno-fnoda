package alunocarta.service;

import alunocarta.model.MalaDiretaAluno;
import alunocarta.thirdservice.Aluno;
import alunocarta.thirdservice.AlunoResponse;
import alunocarta.thirdservice.Boletim;
import alunocarta.thirdservice.BoletimResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MalaDiretaAlunoServiceImpl implements MalaDiretaService{

    private static final Logger log = LoggerFactory.getLogger(MalaDiretaAlunoServiceImpl.class);
    public static final BigDecimal MEDIA_NOTA = BigDecimal.valueOf(7);

    @Autowired
    private RestTemplate restTemplate;

    public Integer enviarEmailAlunosRiscoReprovacao() {
        List<Boletim> boletins = boletins("http://www.mocky.io/v2/5a0892693200000807137ffc");

        List<String> cpfAlunosAbaixoMedia = alunosAbaixoMediaEm(boletins);

        List<MalaDiretaAluno> malasDireta = criarMalasDiretaDe(cpfAlunosAbaixoMedia);

        List<Aluno> alunos = alunos("http://www.mocky.io/v2/5a08923c3200000707137ffb");

        return null;
    }

    private List<MalaDiretaAluno> criarMalasDiretaDe(List<String> cpfAlunosAbaixoMedia) {
        return null;
    }

    private List<String> alunosAbaixoMediaEm(List<Boletim> boletins) {
        return boletins.stream()
                .filter(boletim -> boletim
                        .possuiNotaAbaixoDe(MEDIA_NOTA))
                .map(Boletim::getCpf)
                .collect(Collectors.toList());
    }

    private List<Aluno> alunos(final String url) {
        return restTemplate.getForObject(url, AlunoResponse.class).getAlunos();
    }

    private List<Boletim> boletins(final String url) {
        return restTemplate.getForObject(url, BoletimResponse.class).getBoletins();
    }
}
