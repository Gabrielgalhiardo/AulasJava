package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorEmReais = 0, dolar = 5.45F, euro = 6.07F, libra = 7.29F, valorNaMoeda;
        int escolha = 0;
        System.out.println("Digite um valor em reais: ");
        valorEmReais = scanner.nextFloat();
        System.out.println("Digite 1 para conventer para Dolar.\nDigite 2 para converter para Euro\nDigite 3 para converter para Libra");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                valorNaMoeda = valorEmReais;
                valorNaMoeda *= dolar;
                System.out.println("Seu valor de " + valorEmReais +" \nconvertidos para dolar, deu um total de " + valorNaMoeda );
                break;
            case 2:
                valorNaMoeda = valorEmReais;
                valorNaMoeda *= euro;
                System.out.println("Seu valor de R$" + valorEmReais +" \nconvertidos para euro, deu um total de " + valorNaMoeda );
                break;
            case 3:
                valorNaMoeda = valorEmReais;
                valorNaMoeda *= libra;
                System.out.println("Seu valor de " + valorEmReais +" \nconvertidos para Libra, deu um total de " + valorNaMoeda );
                break;
        }
        scanner.close();


    }
}
