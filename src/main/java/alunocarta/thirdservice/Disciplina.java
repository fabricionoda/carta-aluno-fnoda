package alunocarta.thirdservice;

import java.math.BigDecimal;

public class Disciplina {
    String disciplina;
    BigDecimal nota;

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
}
