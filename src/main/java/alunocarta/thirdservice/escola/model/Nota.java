package alunocarta.thirdservice.escola.model;

import java.math.BigDecimal;

public class Nota {
    String disciplina;
    BigDecimal nota;

    public static Nota of() {
        return new Nota();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    public boolean isAbaixoDaMedia(BigDecimal mediaNota) {
        return nota.compareTo(mediaNota) <= 0;
    }
}
