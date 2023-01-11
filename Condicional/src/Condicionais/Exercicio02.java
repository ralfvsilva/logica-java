package Condicionais;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            if (num > 0) {
                System.out.println("O número " + num + " é par e positivo.");
            } else if (num < 0){
                System.out.println("O número " + num + " é par e negativo.");
            } else {
                System.out.println("O numero " + num + " + é par.");
            }
        } else {
            if (num > 0) {
                System.out.println("O número " + num + " é impar e positivo.");
            } else if (num < 0){
                System.out.println("O número " + num + " é impar e negativo.");
            } else {
                System.out.println("O numero " + num + " + é par.");
            }
        }

        sc.close();
    }
}
