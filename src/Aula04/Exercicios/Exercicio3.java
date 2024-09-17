package Aula04.Exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        int codDoProduto = 3;
        switch (codDoProduto) {
            case 1:
                System.out.println("Eletrõnicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Verstuário");
                break;
            default:
                System.out.println("numero invalido");
        }
        System.out.println("Pois voce que escolheu = " + codDoProduto);


    }
}
