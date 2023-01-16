package atividade05;

public class Ingresso {

    private String nome;
    private String sobrenome;
    private String cpf;
    private int preco;
    private boolean cartao;

    public Ingresso(String nome, String sobrenome, String cpf, int preco, boolean cartao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.preco = preco;
        this.cartao = cartao;
    }

    public void visu(){
        System.out.println("\nNome: " + this.getNome() + " " + this.getSobrenome() + "\nCPF: " + this.getCpf() + "\nPreço do ingresso: " + this.getPreco() + "\nCartão? " + this.isCartao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }
}
