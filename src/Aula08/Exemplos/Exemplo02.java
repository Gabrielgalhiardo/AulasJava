package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo02 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter( "src\\arquivo.txt");
            fileWriter.write("texto a ser gravado no arquivo");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
