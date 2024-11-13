package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double[][] matriz2x2 = new double[2][2];
        double[] vetorSoma = new double[2];
        Scanner scanner = new Scanner(System.in);
        String mostrarValor = "Matriz {\n";




            for (int linha = 0; linha < matriz2x2.length; linha++) {
                mostrarValor += "\t{";
                for (int coluna = 0; coluna < matriz2x2[linha].length; coluna++) {
                    System.out.print("Digite um valor para se colocar na posição {" + linha + "," + coluna + "} : ");
                    matriz2x2[linha][coluna] = scanner.nextInt();
                    vetorSoma[linha] += matriz2x2[linha][coluna];
                    mostrarValor += matriz2x2[linha][coluna];
                    mostrarValor += coluna < (matriz2x2[linha].length - 1) ? "," : "}";
                }
                mostrarValor += linha < (matriz2x2.length - 1) ? ",\n" : "\n";
            }
            mostrarValor += "}";
        System.out.println(mostrarValor + "\nlinha 1 = " + vetorSoma[0] + "\nlinha 2 = " + vetorSoma[1]);
            scanner.close();
        }
    }
