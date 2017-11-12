package alunocarta.thirdservice;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static alunocarta.service.MalaDiretaAlunoServiceImpl.MEDIA_NOTA;

public class NotaTest {

    @Test
    public void dado_nota_abaixo_da_media() throws Exception {
        Nota nota = Nota.of();
        nota.setNota(BigDecimal.valueOf(6.9));
        Assert.assertTrue(nota.isAbaixoDaMedia(MEDIA_NOTA));
    }

    @Test
    public void dado_nota_acima_da_media() throws Exception {
        Nota nota = Nota.of();
        nota.setNota(BigDecimal.valueOf(7.1));
        Assert.assertFalse(nota.isAbaixoDaMedia(MEDIA_NOTA));
    }

    @Test
    public void dado_nota_igual_a_media() throws Exception {
        Nota nota = Nota.of();
        nota.setNota(BigDecimal.valueOf(7));
        Assert.assertTrue(nota.isAbaixoDaMedia(MEDIA_NOTA));
    }

}