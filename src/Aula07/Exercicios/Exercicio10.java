package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura;
        System.out.println("Digite seu peso em KG:");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura em m");
        altura = scanner.nextDouble();
        System.out.println("Seu IMC é de: " + calcularIMC(peso, altura));
    }

    static double calcularIMC(double peso, double altura) {
        double IMC = 0;
        IMC = peso / (altura * altura);
        return IMC;
    }
}
