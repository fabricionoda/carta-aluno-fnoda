package alunocarta.thirdservice;

import alunocarta.thirdservice.escola.model.Aluno;
import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {

    @Test
    public void dado_cpf_formtado_retorna_somente_numeros() throws Exception {
        Aluno aluno = Aluno.of();
        aluno.setDocumento("050.957.349-58");
        Assert.assertEquals("05095734958",aluno.getDocumento());
    }
}