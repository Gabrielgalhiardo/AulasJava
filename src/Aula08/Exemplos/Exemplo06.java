package Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Exemplo06 {
    public static void main(String[] args) {
            try {
                FileWriter fileWriter = new FileWriter("src\\arquivo.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write("\ntexto escrito no arquivo com buffer");
                bufferedWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
