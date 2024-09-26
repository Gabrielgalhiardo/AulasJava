package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int numerosAleatorios, pares = 0, impares = 0, contagem = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o " + contagem + "° numero de 0 a 100\nPara sair coloque um numero negativo");
            numerosAleatorios = scanner.nextInt();
            if (numerosAleatorios > 100) {
                System.out.println("Numero muito grande, interrupção realizada");
                break;
            }else {
                if (numerosAleatorios % 2 == 0) {
                    pares++;
                } else {
                    impares++;

                }
                contagem++;

            }
        } while (numerosAleatorios >= 0);
        System.out.println("Voce digitou " + contagem + " numeros.\nDentre eles existem " + pares + " numeros pares.\nE existem " + impares + " numeros impares.");

    }
}
