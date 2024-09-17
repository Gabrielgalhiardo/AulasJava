package Aula04.Exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        float valorDasVendas = 5000F;
        float desconto;

        if (valorDasVendas < 1000.0F) {
            desconto = 0.05F;
        } else if (valorDasVendas >= 1000 && valorDasVendas <= 5000) {
            desconto = 0.10F;
        } else {
            desconto = 0.15F;
        }

        System.out.println("Sua comissão foi de: " + (valorDasVendas * desconto)+"R$\nVendendo um produto de: "+valorDasVendas+"R$");

    }
}
