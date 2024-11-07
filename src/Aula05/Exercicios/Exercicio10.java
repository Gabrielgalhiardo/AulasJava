package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosAleatorios, pares = 0, impares = 0, contagem = 0;


        do {
            System.out.println("Digite o " + (contagem + 1) + "° numero de 0 a 100\nPara sair coloque um numero negativo");
            numerosAleatorios = scanner.nextInt();
            if (numerosAleatorios > 100)
                break;

            if (numerosAleatorios % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contagem++;
        }
            while (numerosAleatorios >= 0) ;

        if (numerosAleatorios < 0){
            if (numerosAleatorios % 2 == 0) {
                pares--;
            } else {
                impares--;
            }
            contagem--;
        }

            if (numerosAleatorios > 100){
                System.out.println("Numero muito grande, interrupção realizada");
            }else {
                System.out.println("Voce digitou " + contagem + " numeros.\nDentre eles existem " + pares + " numeros pares.\nE existem " + impares + " numeros impares.");
                scanner.close();
            }
        }
    }
