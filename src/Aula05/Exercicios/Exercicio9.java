package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int numeroAleatorio = 47, palpite;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de 1 a 100 que estou pensando");
        palpite = scanner.nextInt();
        if (numeroAleatorio == palpite) {
            System.out.println("Você acertou o numero que eu estava pensando!!!");
        } else {
            do {
                if (palpite > numeroAleatorio) {
                    System.out.println("Numero errado.\nDigite um numero menor que " + palpite);
                    palpite = scanner.nextInt();
                } else {
                    System.out.println("Numero errado.\nDigite um numero maior que " + palpite);
                    palpite = scanner.nextInt();
                }
            } while (!(numeroAleatorio == palpite));
            System.out.println("Você acertou o numero que eu estava pensando!!");
            scanner.close();
        }
    }
}
