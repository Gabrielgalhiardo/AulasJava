package Aula07.Exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        int soma, num1,num2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite o num1");
        num1 =scanner.nextInt();
        System.out.println("Digite o num2");
        num2 =scanner.nextInt();

        soma = funcaoComParametrosComRetorno(num1,num2);
        System.out.println("Retorno da função " + soma);

        scanner.close();
    }
    public static int funcaoComParametrosComRetorno(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }
}
