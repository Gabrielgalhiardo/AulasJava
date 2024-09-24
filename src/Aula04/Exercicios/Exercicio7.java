package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float numero1 = 2F;
        float numero2 = 10F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para soma \nDigite 2 para subtração \nDigite 3 para multiplicação \nDigite 4 para divisão");
        int escolha = scanner.nextInt();
        System.out.println("Numero digitado foi: "+ escolha);
        switch (escolha) {
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                System.out.println(numero1 / numero2);
                break;
            default:
                System.out.println("Numero invalido");
        }
        scanner.close();

    }
}
