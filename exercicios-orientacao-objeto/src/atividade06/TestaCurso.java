package atividade06;

public class TestaCurso {

    public static void main(String[] args) {

        Curso c1 = new Curso("Ralf", "Engenharia de Software", "Tecnologia", 257, "012.345.678-90");
        Curso c2 = new Curso("Alexia", "Recursos Humanos", "Gestão de pessoas", 324, "098.765.432-11");

        c1.visu();
        c2.visu();
    }
}
