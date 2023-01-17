package atividade01;

public class PessoaJuridica extends Cliente{

    private String cnpj;
    private boolean mei;

    public PessoaJuridica(String nome, String sobrenome, String dataNasc, boolean cartao, String cnpj, boolean mei) {
        super(nome, sobrenome, dataNasc, cartao);
        this.cnpj = cnpj;
        this.mei = mei;
    }

    @Override
    public void visu(){
        super.visu();
        System.out.println("\nNome: " + this.getNome() + " " + this.getSobrenome() + "\nCNPJ: " + this.getCnpj() + "\nData de nascimento: " + this.getDataNasc() + "\nCartão? " + this.isCartao() + "\nMei: " + this.isMei());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isMei() {
        return mei;
    }

    public void setMei(boolean mei) {
        this.mei = mei;
    }
}
