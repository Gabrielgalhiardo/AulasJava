package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        int[][] matrizCobtagemNumPares4x4 = new int[4][4];
        String mostrarValor = "Matriz {\n";
        int numPares = 0;
        Scanner scanner = new Scanner(System.in);

        for (int linha = 0; linha < matrizCobtagemNumPares4x4.length; linha++) {
            mostrarValor += "\t{";
            for (int coluna = 0; coluna < matrizCobtagemNumPares4x4.length; coluna++) {
                System.out.println("Digite um valor na posição: {" + linha + "," + coluna + "}");
                matrizCobtagemNumPares4x4[linha][coluna] = scanner.nextInt();
                scanner.nextLine();
                if (matrizCobtagemNumPares4x4[linha][coluna] % 2 == 0) {
                    numPares += 1;
                }
                mostrarValor += matrizCobtagemNumPares4x4[linha][coluna];
                mostrarValor += coluna < (matrizCobtagemNumPares4x4[linha].length - 1) ? "," : "}";
            }
            mostrarValor += linha < (matrizCobtagemNumPares4x4[linha].length - 1) ? ",\n" : "\n";

        }
        mostrarValor += "}";
        System.out.println(mostrarValor + "\nCom um total de " + numPares + " numeros pares");
        scanner.close();
    }
}
