package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        int [][] matriz = new int[2][2];
        String mostrarValor = "matriz{\n";

        Scanner scanner = new Scanner(System.in);

        for (int libha = 0; libha < matriz.length; libha++) {
            mostrarValor += "\t{";
            for (int coluna = 0; coluna < matriz[libha].length; coluna++) {
                System.out.println("Digite o elemento na posição {"+ libha +"}{"+ coluna +"}" );
                matriz[libha][coluna]=scanner.nextInt();
                mostrarValor += matriz[libha][coluna];
                mostrarValor += coluna < (matriz[libha].length -1) ? "," :"}";
            }
            mostrarValor += libha < (matriz.length - 1) ? ",\n" : "\n}";
        }
        System.out.println(mostrarValor);
    }
}
