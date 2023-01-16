package atividade06;

public class Curso {

    private String nomeAluno;
    private String nomeCurso;
    private String area;
    private int valor;
    private String cpf;

    public Curso(String nomeAluno, String nomeCurso, String area, int valor, String cpf) {
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
        this.area = area;
        this.valor = valor;
        this.cpf = cpf;
    }

    public void visu(){
        System.out.println("\nNome do aluno: " + this.getNomeAluno() + "\nNome do curso: " + this.getNomeCurso() + "\nÁrea do curso: " + this.getArea() + "\nValor do curso: " + this.getValor() + "\n " + this.getCpf());
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
