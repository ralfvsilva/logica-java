package atividade01;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ralf ", "Silva", "12/01/1999", true);
        Cliente cliente2 = new Cliente("Jonas ", "Santos", "25/03/1995", false);
        PessoaFisica c3 = new PessoaFisica("Isabela", "Souza", "18/05/1989", false, 1999, "761.854.931-04");
        PessoaFisica c4 = new PessoaFisica("Fernanda", "Soares", "13/11/2000", true, 2350, "325.427.851-23");
        PessoaJuridica c5 = new PessoaJuridica("Isabela", "Souza", "18/05/1989", false, "04.128.563/0001-10", false);
        PessoaJuridica c6 = new PessoaJuridica("Fernanda", "Soares", "13/11/2000", true, "12.528.708/0001-07", true);


        cliente1.visu();
        cliente2.visu();
        c3.visu();
        c4.visu();
        c5.visu();
        c6.visu();

    }
}