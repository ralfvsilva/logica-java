package Operadores;

import java.util.Scanner;

public class multiExercicios {
    public static void main(String[] args) {

        package Operadores;

import java.util.Scanner;
        // exercicio 1
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
        package Operadores;

import java.util.Scanner;
        // exercicio 2
        public class Exercicio02 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                float nota1, nota2, nota3, nota4 = 0f;

                System.out.println("Nota 1: ");
                nota1 = sc.nextFloat();

                System.out.println("Nota 2: ");
                nota2 = sc.nextFloat();

                System.out.println("Nota 3: ");
                nota3 = sc.nextFloat();

                System.out.println("Nota 4: ");
                nota4 = sc.nextFloat();

                float mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;

                System.out.printf("Média final: %.1f", mediaFinal);

                sc.close();
            }
        }
        package Operadores;

import java.util.Scanner;
        // exercicio 3
        public class Exercicio03 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Salário Bruto: ");
                float salarioBruto = sc.nextFloat();

                System.out.println("Adicional Noturno: ");
                float adicionalNoturno = sc.nextFloat();

                System.out.println("Horas Extras: ");
                float horaExtra = sc.nextFloat();

                System.out.println("Descontos: ");
                float descontos = sc.nextFloat();

                float salarioLiquido = (salarioBruto + adicionalNoturno + (horaExtra * 5)) - descontos;

                System.out.printf("Salário Líquido: %.2f", salarioLiquido);

                sc.close();
            }
        }package Operadores;

import java.util.Scanner;
        // exercicio 4
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
    }
}
