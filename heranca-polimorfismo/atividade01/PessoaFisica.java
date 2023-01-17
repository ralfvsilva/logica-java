package atividade01;

public class PessoaFisica extends Cliente {

    private int ipva;
    private String cpf;

    public PessoaFisica(String nome, String sobrenome, String dataNasc, boolean cartao, int ipva, String cpf) {
        super(nome, sobrenome, dataNasc, cartao);
        this.ipva = ipva;
        this.cpf = cpf;
    }

    @Override
    public void visu(){
        super.visu();
        System.out.println("\nNome: " + this.getNome() + " " + this.getSobrenome() + "\nCPF: " + this.getCpf() + "\nData de nascimento: " + this.getDataNasc() + "\nCartão? " + this.isCartao() + "\nValor ipva: " + this.getIpva());
    }

    public int getIpva() {
        return ipva;
    }

    public void setIpva(int ipva) {
        this.ipva = ipva;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
