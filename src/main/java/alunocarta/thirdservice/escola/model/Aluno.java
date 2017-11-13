package alunocarta.thirdservice.escola.model;

public class Aluno {
    String documento;
    String nome;
    String endereco;
    String cep;

    public static Aluno of() {
        return new Aluno();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String cpfSomenteNumeros() {
        return documento.replaceAll("\\D+","");
    }
}
