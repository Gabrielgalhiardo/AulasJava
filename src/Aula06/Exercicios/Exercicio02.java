package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posicao = 0;
        String usuario, resposta = "Valor não encontrado";

        String[] letras = {"i", "g", "o", "r", "c", "v"};

        System.out.println("Digite uma letra que voce quer procurar");
        usuario = scanner.nextLine();

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(usuario)) {
                resposta = "Valor encontrado";
                posicao = i;
                break;
            }
        }
        if (resposta.equals("Valor encontrado")) {
            System.out.println(resposta + " na posição " + posicao);
        } else {
            System.out.println(resposta);
        }
        scanner.close();


    }
}
