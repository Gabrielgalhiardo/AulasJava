package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizVerificadoraDeMaiorNum = new int[3][3];
        String mostrarvalor = "Matriz {\n";
        int maiorNum = 0;

        for (int linha = 0; linha < matrizVerificadoraDeMaiorNum.length; linha++) {
            mostrarvalor += "\t{";
            for (int coluna = 0; coluna < matrizVerificadoraDeMaiorNum.length; coluna++) {
                System.out.println("Digite um valor na posição: {" + linha + "," + coluna + "}");
                matrizVerificadoraDeMaiorNum[linha][coluna] += scanner.nextInt();
                scanner.nextLine();
                if (matrizVerificadoraDeMaiorNum[linha][coluna] > maiorNum)
                    maiorNum = matrizVerificadoraDeMaiorNum[linha][coluna];
                mostrarvalor += matrizVerificadoraDeMaiorNum[linha][coluna];
                mostrarvalor += coluna < matrizVerificadoraDeMaiorNum[linha].length - 1 ? "," : "}";
            }
            mostrarvalor += linha < matrizVerificadoraDeMaiorNum[linha].length - 1 ? ",\n" : "\n";
        }
        mostrarvalor += "}";
        System.out.println(mostrarvalor + "\nO maior numero digitado na matriz é: " + maiorNum);
        scanner.close();
    }
}
