package atividade01;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ralf ", "Silva", "361.862.468-92", "12/01/1999", true);
        Cliente cliente2 = new Cliente("Jonas ", "Santos", "864.465.371-55", "25/03/1995", false);

        cliente1.visualizar("Nome comoleto: " + cliente1.getNome() + cliente1.getSobrenome() + "\nCPF: " + cliente1.getCpf() + "\nData de nascimento: " + cliente1.getDataNasc() + "\nPossui cartão? " + cliente1.isCartao());

        cliente2.visualizar("\nNome comoleto: " + cliente2.getNome() + cliente2.getSobrenome() + "\nCPF: " + cliente2.getCpf() + "\nData de nascimento: " + cliente2.getDataNasc() + "\nPossui cartão? " + cliente2.isCartao());
    }
}