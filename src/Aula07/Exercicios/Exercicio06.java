package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int num = 0;
        String verificador = "seu número é impar";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        num = scanner.nextInt();

        if (verificarPar(num) == true) {
            verificador = "Seu número é par";
        }
        System.out.println("O número escolhido foi " + verificador);

        scanner.close();
    }

    static boolean verificarPar(int num) {
        boolean par = false;
        if (num % 2 == 0) {
            par = true;
        }
        return par;

    }
}
