package Operadores;

import java.util.Scanner;

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
}
