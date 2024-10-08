package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media = 0, numDeNotas = 4;
        float[] notas = new float[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + i + "° nota");
            notas[i]= scanner.nextFloat();
            media += notas[i];
        }
        System.out.println("Sua média final é igual a: " + (media/numDeNotas) );

    }
}
