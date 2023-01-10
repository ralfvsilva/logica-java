package Operadores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        float salario, abono = 0f;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        salario = in.nextFloat();

        System.out.println("Digite o abono: ");
        abono = in.nextFloat();

        float novoSalario = salario + abono;

        System.out.printf("Novo salário: %.2f", novoSalario);

        in.close();
    }
}
