package atividade04;

public class TestaFarmacia {

    public static void main(String[] args) {

        Farmacia f1 = new Farmacia("Maurício", "Santana", "574.279.648-77", true, 239);
        Farmacia f2 = new Farmacia("Abner", "Souza", "793.419.386-90", false, 22);

        f1.visu("\nNome: " + f1.getNome() + " " + f1.getSobrenome() + "\nCPF: " + f1.getCpf() + "\nPossui cadastro? " + f1.isCadastro() + "\nTotal da compra: " + f1.getTotal());
        f2.visu("\nNome: " + f2.getNome() + " " + f2.getSobrenome() + "\nCPF: " + f2.getCpf() + "\nPossui cadastro? " + f2.isCadastro() + "\nTotal da compra: " + f2.getTotal());

    }
}
