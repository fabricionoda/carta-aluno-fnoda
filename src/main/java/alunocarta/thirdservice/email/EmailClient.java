package alunocarta.thirdservice.email;

import alunocarta.model.MalaDiretaAluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailClient {
    public Integer enviar(List<MalaDiretaAluno> malaDiretaAlunoList) {
        return malaDiretaAlunoList.size();
    }
}
