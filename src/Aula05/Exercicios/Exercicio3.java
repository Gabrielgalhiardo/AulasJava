package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int numero, fatorial = 1, i;
        System.out.println("Digite um numero positivo para fazer o fatorial");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        i = numero;


        do {
            i --;
            numero *= fatorial;
            fatorial ++ ;

        }while (i > 1);
        System.out.println("O resultado foi: " + numero);
        scanner.close();


    }
}
