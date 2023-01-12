package LacoRepeticao;

import java.util.Scanner;

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
