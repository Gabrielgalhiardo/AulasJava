package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int numero;
        boolean numPrimo = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se ele é um numero primo");
        numero = scanner.nextInt();
        if (numero <= 1) {
            numPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0){
                    numPrimo = false;
                    break;
                }else{
                    numPrimo = true;
                }

            }
        }
        if (numPrimo == true){
            System.out.println("O número " + numero + " é um número primo");
        }else {
            System.out.println("O número " + numero + " não é um número primo");
        }
        scanner.close();

    }


}
        


