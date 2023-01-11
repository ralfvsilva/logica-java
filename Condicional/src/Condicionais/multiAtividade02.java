package Condicionais;

import java.util.Scanner;

public class multiAtividade02 {
    public static void main(String[] args) {
        package Condicionais;

import java.util.Scanner;
        // exercicio 01
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
        package Condicionais;

import java.util.Scanner;
        // exercicio 02
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
        package Condicionais;

import java.io.PrintStream;
import java.util.Scanner;
        // exercicio 04
        public class Exercicio04 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int opcao = 0;

                System.out.println("Código do produto: ");
                opcao = sc.nextInt();

                System.out.println("Quantidade: ");
                int qtd = sc.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Produto: Cachorro-quente \nValor total: R$ " + (qtd * 10));
                        break;
                    case 2:
                        System.out.println("Produto: X-Salada \nValor total: R$ " + (qtd * 15));
                        break;
                    case 3:
                        System.out.println("Produto: X-Bacon \nValor total: R$ " + (qtd * 18));
                        break;
                    case 4:
                        System.out.println("Produto: Bauru \nValor total: R$ " + (qtd * 12));
                        break;
                    case 5:
                        System.out.println("Produto: Refrigerante \nValor total: R$ " + (qtd * 8));
                        break;
                    case 6:
                        System.out.println("Produto: Suco de laranja \nValor total: R$ " + (qtd * 13));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }



                sc.close();
            }
        }

    }
}
