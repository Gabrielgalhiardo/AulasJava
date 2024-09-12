package Aula04.Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        float valorDoProduto = 3021.3F;
        float  desconto = 0.1F;
       desconto = valorDoProduto > 100F ? 0.1F : 0;
            System.out.println("Seu produto saiu pelo preço de: " + (valorDoProduto - valorDoProduto*desconto) + "Reais\nCom desconto de: " + (valorDoProduto*desconto) + "Reais");



    }
}
