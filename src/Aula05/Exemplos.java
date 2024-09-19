package Aula05;

import java.util.Scanner;

public class Exemplos {
    private static String nome;

    public static void main(String[] args) {

        int idade = 0;
        while (idade <= 18) {
            System.out.println(idade);
            idade = idade + 1;
        }
        Scanner scanner = new Scanner(System.in);
        String nome = "Igor", digitada = "";
        System.out.println("Digite Meu nome");
        digitada = scanner.nextLine();
        while (!nome.equals(digitada)) {
            System.out.println("Nome errado");
            digitada = scanner.nextLine();
            }
        System.out.println("Parabéns esse é seu nome, muito bonito por sinal");

    }
}
