package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        float hora = scanner.nextFloat();
        if (hora > 5 && hora <13){
            System.out.println("Ta cedinhoo!");
        } else if (hora >12 && hora <19) {
            System.out.println("Esta de tarde!");
        } else if (hora > 18 && hora < 23) {
            System.out.println("Esta de noite!");
        } else if (hora > 22 && hora < 6 || hora <= 5) {
            System.out.println("Esta de madrugada!");
        }else{
            System.out.println("Você digitou alguma coisa errada");
        }
        scanner.close();
    }
}
