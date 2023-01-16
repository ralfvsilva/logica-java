package atividade01;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String dataNasc;
    private boolean cartao;

    public Cliente(String nome, String sobrenome, String cpf, String dataNasc, boolean cartao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.cartao = cartao;
    }

    public Cliente() {
    }

    public void visualizar(String visu){
        System.out.println(visu);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public boolean isCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }
}
