package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] vOuF = new boolean[8];
        String mostraValor = "vetor{";
        int contagem = 0;

        for (int i = 0; i < vOuF.length; i++) {
            System.out.println("Digite o " + i + "° true ou false");
            vOuF[i] = scanner.nextBoolean();
            mostraValor += vOuF[i] + "," ;
            if (vOuF[i] == true) {
                contagem++;
            }
        }
        System.out.println("Você digitou: " + contagem + " trues.\nCom o " + mostraValor);

        scanner.close();

    }
}
