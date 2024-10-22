package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("digite o 1° numero");
        num1= scanner.nextInt();
        System.out.println("digite o 2° numero");
        num2= scanner.nextInt();
        System.out.println("digite o 3° numero");
        num3= scanner.nextInt();

        System.out.println(maiorNumero(num1,num2,num3));


        scanner.close();
    }
    static String maiorNumero (int num1, int num2, int num3){
        String maior = " ";

        if (num1 > num2) {
           if ( num1 > num3){
               maior = "num1 maior";
           }
        }if (num2 > num1) {
            if (num2 > num3){
                maior = "num2 maior";
        }
        }if (num3 > num2) {
            if (num3 > num1){
                maior = "num3 maior";
            }
        }

        return maior;
    }
}
