package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "";
        String[] letras = {"i","g","o", "r", "c","v"};
        System.out.println("Digite uma leta que voce quer procurar");
        usuario = scanner.nextLine();
        for (int i = 0; i < letras.length; i++) {
           if (letras[i].equals (usuario)){
               System.out.println("Voce escreveu uma letra que esta presente neste vetor\nno vetor de numero " + i);
               break;
           }

        }
        System.out.println("Valor nao encontrado em nunhum dos vetores");

    }
}
