package Aula08.Exercicios.Exercicio01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\AulasJava\\src\\Aula08\\Exercicios\\Exercicio01\\alunos.txt");

        try {
            FileWriter fileWriter = new FileWriter(arquivo);

            for (int i = 1; i < 6; i++) {
                System.out.print("Digite o nome do " + i + " aluno: ");
                nome = scanner.nextLine();
                fileWriter.write(nome+"\n");

            }
            fileWriter.close();


        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        scanner.close();

    }
}

