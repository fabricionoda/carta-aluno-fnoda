package alunocarta.model;

import alunocarta.thirdservice.escola.model.Aluno;

public class MalaDiretaAluno {

    public static final String MENSAGEM_RISCO_REPROVACAO = "Atenção, você possui uma ou mais displinas com risco de reprovação";
    private String nome;
    private String endereco;
    private String cep;
    private String mensagem;

    public MalaDiretaAluno(Aluno aluno) {
        nome = aluno.getNome();
        endereco = aluno.getEndereco();
        cep = aluno.getCep();
        mensagem = MENSAGEM_RISCO_REPROVACAO;
    }

    public static MalaDiretaAluno of(Aluno aluno) {
        return new MalaDiretaAluno(aluno);
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
