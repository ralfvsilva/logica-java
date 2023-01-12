package LacoRepeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1, positivo = 0;

        do {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num > 0){
                positivo += num;
            }

        } while (num != 0);

        System.out.println("A soma dos números positivos é: " + positivo);


        sc.close();
    }
}
