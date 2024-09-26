package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        float notas, total = 0F, divisao = 5F;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("Digite a " + i + "° nota:");
            notas = scanner.nextFloat();
            total += notas;

        }
        total = total /divisao;
        System.out.println("Sua média é " + total);
        scanner.close();
    }
}
