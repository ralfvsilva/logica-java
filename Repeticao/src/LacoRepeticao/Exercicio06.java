package LacoRepeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, soma = 0, count = 0;
        double media = 0;

        do {

            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num % 3 == 0 && num != 0) {
                soma += num;
                count++;
            }

        } while (num != 0);

        media = (double) soma/count;

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

        sc.close();
    }
}
