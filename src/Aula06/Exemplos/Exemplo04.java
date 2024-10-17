package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de vetores que deseja");

        int quantidade = scanner.nextInt();

        int[] vetor = new int[quantidade];
        String mostraValor = "vetor{";

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite a " + (i+1) + "° numero");
            vetor[i] =scanner.nextInt();
            mostraValor += vetor[i];
            mostraValor += i< vetor.length -1 ? "," :"}";
    }

        System.out.println(mostraValor);
    }
}
