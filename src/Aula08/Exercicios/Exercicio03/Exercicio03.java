package Aula08.Exercicios.Exercicio03;

import java.io.*;

public class Exercicio03 {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Aluno\\Documents\\AulasJava\\src\\Aula08\\Exercicios\\Exercicio01\\alunos.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Aluno\\Documents\\AulasJava\\src\\Aula08\\Exercicios\\Exercicio03\\backup_alunos.txt"));
            String linha = "";

            while ((linha = bufferedReader.readLine()) !=null ){
                bufferedWriter.write(linha+ "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
