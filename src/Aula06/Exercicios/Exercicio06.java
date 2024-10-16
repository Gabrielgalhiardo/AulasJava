package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        String mostrarValor = "{";

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite um valor para se colocar na posição {"+linha+"}{"+coluna+"}");
                matriz[linha][coluna] = scanner.nextInt();


            }

        }
    }
}
