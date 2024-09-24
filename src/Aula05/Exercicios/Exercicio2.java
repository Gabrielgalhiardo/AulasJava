package Aula05.Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        int somaDosNumerosPares = 0, contagem = 0;

        while (contagem <= 100) {
            if (contagem % 2 == 0 ){
                somaDosNumerosPares += contagem;
            }
            contagem ++;
        }
        System.out.println("A soma dos 100 primeiros números é:  " + somaDosNumerosPares);
    }
}
