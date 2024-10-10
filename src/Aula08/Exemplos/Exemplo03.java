package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo03 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter( "src\\arquivo.txt", true);
            fileWriter.write("\ntexto escrito com modo apend habilitado");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
