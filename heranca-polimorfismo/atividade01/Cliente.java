package atividade01;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String dataNasc;
    private boolean cartao;

    public Cliente(String nome, String sobrenome, String dataNasc, boolean cartao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.cartao = cartao;
    }

    public void visu(){
        System.out.println("\nNome: " + this.getNome() + this.getSobrenome() + "\nData de nascimento: " + this.getDataNasc());
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
