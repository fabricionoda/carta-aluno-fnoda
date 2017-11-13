package alunocarta.thirdservice.escola;

import alunocarta.thirdservice.escola.model.Aluno;
import alunocarta.thirdservice.escola.model.AlunoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServicoCadastroClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${aluno.endpoint.url}")
    private String url;

    public Aluno buscaAlunoPorCPF(String cpf) {
        return alunos().stream()
                .filter(e -> e.cpfSomenteNumeros().equals(cpf))
                .findFirst().orElse(null);
    }

    private List<Aluno> alunos() {
        return restTemplate.getForObject(url, AlunoResponse.class).getAlunos();
    }
}
