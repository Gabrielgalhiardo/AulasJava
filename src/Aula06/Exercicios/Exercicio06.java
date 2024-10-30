package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        String mostrarValor = "Matriz{\n";

        for (int linha = 0; linha < matriz.length; linha++) {
            mostrarValor += "\t{";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite um valor para se colocar na posição {" + linha + "," + coluna + "} : ");
                matriz[linha][coluna] = scanner.nextInt();
                mostrarValor += matriz[linha][coluna];
                mostrarValor += coluna < (matriz[linha].length - 1) ? "," : "}";
            }
            mostrarValor += linha < (matriz.length - 1) ? ",\n" : "\n";
        }
        mostrarValor += "}";
        System.out.println(mostrarValor);
        scanner.close();
    }
}
