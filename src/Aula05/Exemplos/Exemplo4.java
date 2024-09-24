package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        String nome = "Gabriel", nomeDigitado;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Adivinhe meu nome:");
            nomeDigitado = scanner.nextLine();

        }while (!nome.equals(nomeDigitado));
        System.out.println("Conseguiu adivinhar");

        scanner.close();
    }
}
