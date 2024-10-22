package Aula08.Exercicios;

import java.io.*;

public class Exercicio02 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Aluno\\Documents\\AulasJava\\src\\Aula08\\Exercicios\\Exercicio01\\alunos.txt");


        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Aluno\\Documents\\AulasJava\\src\\Aula08\\Exercicios\\Exercicio01\\alunos.txt"));
                String linha = "";
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(linha);
                }
                bufferedReader.close();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            }else {
            file.createNewFile();
        }
        }
    }
