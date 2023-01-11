package Condicionais;

import java.io.PrintStream;
import java.util.Scanner;

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
