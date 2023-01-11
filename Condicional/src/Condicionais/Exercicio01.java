package Condicionais;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0, B = 0, C = 0;

        System.out.println("Digite o número A: ");
        A = sc.nextInt();

        System.out.println("Digite o número B: ");
        B = sc.nextInt();

        System.out.println("Digite o número C: ");
        C = sc.nextInt();

        int somaAB = A + B;

        if (somaAB > C) {
            System.out.println(A + " + " + B + " = " + somaAB + " > " + C + "\nA soma de A + B é maior que C.");
        }
        else if (somaAB < C) {
            System.out.println(A + " + " + B + " = " + somaAB + " < " + C + "\nA soma de A + B é menor que C.");
        } else {
            System.out.println(A + " + " + B + " = " + C + " = " + C + "\nA soma de A + B é igual a C.");
        }




        sc.close();
    }
}
