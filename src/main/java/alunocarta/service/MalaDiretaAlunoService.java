package alunocarta.service;

import alunocarta.model.MalaDiretaAluno;
import alunocarta.thirdservice.Aluno;
import alunocarta.thirdservice.AlunoResponse;
import alunocarta.thirdservice.Boletim;
import alunocarta.thirdservice.BoletimResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MalaDiretaAlunoService {

    private static final Logger log = LoggerFactory.getLogger(MalaDiretaAlunoService.class);

    @Autowired
    private RestTemplate restTemplate;

    public Integer enviarEmailAlunosRiscoReprovacao() {
        alunos("http://www.mocky.io/v2/5a08923c3200000707137ffb");
        boletins("http://www.mocky.io/v2/5a0892693200000807137ffc");
        return null;
    }

    private List<Aluno> alunos(final String url) {
        return restTemplate.getForObject(url, AlunoResponse.class).getAlunos();
    }

    private List<Boletim> boletins(final String url) {
        return restTemplate.getForObject(url, BoletimResponse.class).getBoletins();
    }
}
