package Operadores;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1 = 0f, num2 = 0f, num3 = 0f, num4 = 0f;

        System.out.println("Número 1: ");
        num1 = sc.nextFloat();

        System.out.println("Número 2: ");
        num2 = sc.nextFloat();

        System.out.println("Número 3: ");
        num3 = sc.nextFloat();

        System.out.println("Número 4: ");
        num4 = sc.nextFloat();

        float diferenca = (num1 * num2) - (num3 * num4);

        System.out.printf("Diferença: %.1f%n", diferenca );

        sc.close();
    }
}
