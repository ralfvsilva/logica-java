package LacoRepeticao;

import java.util.Scanner;

public class multiExercicio {
    public static void main(String[] args) {
        package LacoRepeticao;

import java.util.Scanner;
        // Exercicio 01
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
        package LacoRepeticao;

import java.util.Scanner;
        // Exercicio 03
        public class Exercicio03 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int idade = 0, idadeMenor21 = 0, idadeMaior50 = 0;

                while (idade >= 0){
                    System.out.println("Digite uma idade: ");
                    idade = sc.nextInt();

                    if (idade >= 0 && idade < 21){
                        idadeMenor21++;
                    }
                    else if (idade > 50){
                        idadeMaior50++;
                    }
                }

                System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor21);
                System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior50);

                sc.close();
            }
        }
        package LacoRepeticao;

import java.util.Scanner;
        // Exercicio 05
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
        package LacoRepeticao;

import java.util.Scanner;
        // Exercicio 06
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

    }
}
