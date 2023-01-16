package atividade02;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario(001, "João","Lima", 2500, true);
        Funcionario func2 = new Funcionario(001, "Leonardo","Calmon", 4500, false);

        func1.visu("Id: " + func1.getId() + "\nNome: " + func1.getNome() + " " + func1.getSobrenome() + "\nSalário: " + func1.getSalario() + "\nPossui adicional noturno? " + func1.isAdicionalNoturno());
        func2.visu("\n\nId: " + func2.getId() + "\nNome: " + func2.getNome() + " " + func2.getSobrenome() + "\nSalário: " + func2.getSalario() + "\nPossui adicional noturno? " + func2.isAdicionalNoturno());

    }
}
