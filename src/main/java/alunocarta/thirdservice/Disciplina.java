package alunocarta.thirdservice;

import java.math.BigDecimal;

public class Disciplina {
    String nome;
    BigDecimal nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
