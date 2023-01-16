package atividade04;

public class Farmacia {

    private String nome;
    private String sobrenome;
    private String cpf;
    private boolean cadastro;
    private int total;

    public Farmacia(String nome, String sobrenome, String cpf, boolean cadastro, int total) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cadastro = cadastro;
        this.total = total;
    }

    public void visu(String visualizar){
        System.out.println(visualizar);
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

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
