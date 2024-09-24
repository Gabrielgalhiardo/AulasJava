package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Gabriel", digitada;
        System.out.println("Digite Meu nome");

        digitada = scanner.nextLine();

        while (!nome.equals(digitada)) {
            System.out.println("Nome errado");
            digitada = scanner.nextLine();
        }

        System.out.println("Parabéns esse é seu nome, muito bonito por sinal");

    }
}
