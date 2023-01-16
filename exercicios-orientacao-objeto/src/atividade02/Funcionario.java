package atividade02;

public class Funcionario {

    private int id;
    private String nome;
    private String sobrenome;
    private int salario;
    private boolean adicionalNoturno;

    public Funcionario(int id, String nome, String sobrenome, int salario, boolean adicionalNoturno) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.adicionalNoturno = adicionalNoturno;
    }

    public void visu(String visualizar){
        System.out.printf(visualizar);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(boolean adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
}
