package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int[][] matriz3x3 = new int[3][3];
        int somaTotal = 0;
        String mostrarValor = "Matriz {\n";
        Scanner scanner = new Scanner(System.in);

        for (int linha = 0; linha < matriz3x3.length; linha++) {
            mostrarValor += "\t{";
            for (int coluna = 0; coluna < matriz3x3[linha].length; coluna++) {
                System.out.print("Digite um valor para se colocar na posição {" + linha + "," + coluna + "} : ");
                matriz3x3[linha][coluna] = scanner.nextInt();
                somaTotal += matriz3x3[linha][coluna];
                mostrarValor += matriz3x3[linha][coluna];
                mostrarValor += coluna < (matriz3x3[linha].length - 1) ? "," : "}";
            }
            mostrarValor += linha < (matriz3x3.length - 1) ? ",\n" : "\n";
        }
        mostrarValor += "}";
        System.out.println(mostrarValor + "\nA soma total dos números da matriz é: " + somaTotal);
        scanner.close();
    }
}
