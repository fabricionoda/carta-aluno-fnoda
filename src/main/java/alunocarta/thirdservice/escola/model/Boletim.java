package alunocarta.thirdservice.escola.model;

import java.math.BigDecimal;
import java.util.List;

public class Boletim {
    String cpf;
    List<Nota> notas;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public boolean possuiNotaAbaixoDe(final BigDecimal mediaNota) {
        return notas.stream().anyMatch(nota -> nota.isAbaixoDaMedia(mediaNota));
    }
}
