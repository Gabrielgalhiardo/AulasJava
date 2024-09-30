package Aula05.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int fibonacci = 0,n1 = 0, n2=1,contador=0;
        while (contador<10){
            fibonacci = n1  + n2;
            n1 = n2;
            n2 = fibonacci;
            contador++;
            System.out.println("O " +contador+"° termo é: "+fibonacci);
        }






    }
}
