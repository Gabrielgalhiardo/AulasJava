package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int total, num1,num2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite o num1");
        num1 =scanner.nextInt();
        System.out.println("Digite o num2");
        num2 =scanner.nextInt();

        total = somar(num1,num2);
        System.out.println("Retorno da função " + total);

        scanner.close();
    }
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
}
