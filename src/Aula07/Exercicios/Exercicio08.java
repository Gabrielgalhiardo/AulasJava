package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int numEscolhido;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial dele");
        numEscolhido = scanner.nextInt();
        System.out.println("O seu numero: "+ numEscolhido +"\nEm fatorial é: " + calcularFatorial(numEscolhido));
        scanner.close();
    }
    static int calcularFatorial (int numEscolhido){
        int fatorial = 1, total = numEscolhido;

        for (int i = numEscolhido; i > 1; i--) {
            total *= fatorial;
            fatorial++;
        }
        return total;
    }
}
