package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        double numero = 0, fatorial = 1;
        System.out.println("Digite um número positivo para calcular seu fatorial");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextDouble();

        for (double i = numero; i > 1; i--) {
            numero *= fatorial;
            fatorial++;
        }
        System.out.println("A resposta é " + numero);
    }
}
