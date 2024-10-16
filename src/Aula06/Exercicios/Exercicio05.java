package Aula06.Exercicios;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user, respostaFim = "";
        String [] nomes = {"gabriel", "micka", "giovanna"};
        
        System.out.println("Digite um nome para verificar");
        user=scanner.nextLine();
        
        for (int i = 0; i < nomes.length ; i++) {
            if (user .equals(nomes[i])){
            respostaFim = "Você digitou um nome presente no vetor";
            }else { 
            respostaFim = "Você digitou um nome que não está no vetor";
            }
        }
        System.out.println(respostaFim);
        
      

    }
}
