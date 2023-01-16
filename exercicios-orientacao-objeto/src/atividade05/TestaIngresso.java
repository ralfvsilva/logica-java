package atividade05;

public class TestaIngresso {

    public static void main(String[] args) {

        Ingresso ing1 = new Ingresso("Maria", "Quitéria", "325.479.850-53", 33, true);
        Ingresso ing2 = new Ingresso("Gabriela", "Silva", "127.537.931-04", 21, true);

        ing1.visu();
        ing2.visu();
    }
}
