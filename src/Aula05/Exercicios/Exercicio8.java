package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int numero, pares = 0, impares = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.println("Digite o " +i+ "° numero");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            }else {
                impares++;
            }

        }
        System.out.println("Você encolheu " +pares+ " numeros pares.\nE escolheu " +impares+ " numeros impares" );
        scanner.close();
    }
}
