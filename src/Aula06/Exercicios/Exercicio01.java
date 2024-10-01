package Aula06.Exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int total = 0;
        int[] vetor = {2, 4, 6, 12, 24}; //valor total 48
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("A casa " + i + " do vetor é " + vetor[i]);
            total += vetor[i];

        }
        System.out.println("A soma total dos vetores é: " + total);

    }

}
