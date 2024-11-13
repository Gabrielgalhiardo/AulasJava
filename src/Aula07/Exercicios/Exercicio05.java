package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1, n2, n3, i = 1;

        System.out.println("Digite o " + i + "° numero");
        n1 = scanner.nextInt();
        i++;
        System.out.println("Digite o " + i + "° numero");
        n2 = scanner.nextInt();
        i++;
        System.out.println("Digite o " + i + "° numero");
        n3 = scanner.nextInt();

        System.out.println("A sua média é: " + calcularMedia(n1, n2, n3));


    }

    static float calcularMedia(float n1, float n2, float n3) {

        return (n1 + n2 + n3) / 3;
    }
}
