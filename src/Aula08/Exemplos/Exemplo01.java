package Aula08.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\AulasJava\\src\\arquivo.txt");
        if (arquivo.exists()) {
            System.out.println("Arquivo existe");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println(arquivo.getName() + "criado com sucesso");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
