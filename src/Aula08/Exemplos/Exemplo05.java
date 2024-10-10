package Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo05 {
    public static void main(String[] args) {
            try {
                FileWriter fileWriter = new FileWriter("src\\arquivo.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write("texto escrito no arquivo com buffer");
                bufferedWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
