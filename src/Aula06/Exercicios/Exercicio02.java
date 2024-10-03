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

               break;
           }
//colocar uama string e ficar mudando de positivo e negativo
        }


    }
}
