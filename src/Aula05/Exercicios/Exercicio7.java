package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10");
        nota = scanner.nextInt();
        if (!(nota <= 10 && nota >= 0)){
            do {
                System.out.println("A nota:" +nota+ " não está no padrão.\nDigite uma nota entre 0 e 10");
                nota = scanner.nextInt();
            }while (!(nota <= 10 && nota >= 0));
        }else{
            System.out.println("Você digitou a nota " +nota+ " e ela é uma nota valida.");
            scanner.close();
        }

    }
}
