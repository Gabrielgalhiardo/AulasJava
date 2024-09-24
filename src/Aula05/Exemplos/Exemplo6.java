package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        int par = 0, impar = 0, num;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            i++;
            System.out.println("Digite o " + i + "° numero");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Você escreveu " + par + " pares\nE escreveu " + impar + " impares");
        scanner.close();

    }
}
