package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseUser, expoente;
        System.out.println("Digite uma base que você quer: ");
        baseUser = scanner.nextInt();
        System.out.println("Digite um expoente que você quer: ");
        expoente = scanner.nextInt();
        System.out.println(calcularPotencia(baseUser, expoente));
        scanner.close();
    }

    static int calcularPotencia(int baseUser, int expoente) {
        int base2 = baseUser;
        if (expoente == 0) {
            baseUser = 1;
        } else {
            for (int i = 1; i < expoente ; i++) {
                baseUser *= base2;
            }
        }
        return baseUser;
    }
}