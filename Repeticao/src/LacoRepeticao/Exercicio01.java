package LacoRepeticao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        System.out.println("Digite o primeiro numero do intervalo: ");
        num1 = in.nextInt();

        System.out.println("Digite o segundo numero do intervalo: ");
        num2 = in.nextInt();

        if (num2 < num1){
            System.out.println("Intervalo inválido.");
        } else {
            for (int i = num1; i <= num2; i++) {

                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println(i + " é multiplo de 3 e 5.");
                }
            }
        }

        in.close();
    }
}
