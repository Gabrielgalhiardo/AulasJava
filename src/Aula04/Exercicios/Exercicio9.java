package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        float hora = scanner.nextFloat();
        if (hora > 5 && hora <12){
            System.out.println("Ta cedinhoo!");
        }
        scanner.close();
    }
}
