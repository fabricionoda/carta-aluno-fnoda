package alunocarta.thirdservice.escola;

import alunocarta.thirdservice.escola.model.Aluno;
import alunocarta.thirdservice.escola.model.AlunoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServicoCadastroClient {

    public static final String HTTP_ALUNO_MOCK = "http://www.mocky.io/v2/5a08923c3200000707137ffb";

    @Autowired
    private RestTemplate restTemplate;

    public Aluno buscaAlunoPorCPF(String cpf) {
        return alunos(HTTP_ALUNO_MOCK).stream()
                .filter(e -> e.cpfSomenteNumeros().equals(cpf))
                .findFirst().orElse(null);
    }

    private List<Aluno> alunos(final String url) {
        return restTemplate.getForObject(url, AlunoResponse.class).getAlunos();
    }
}
