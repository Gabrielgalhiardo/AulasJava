package Aula08.Exemplos;

import java.io.*;

public class Exemplo07 {
    public static void main(String[] args) {
        File arquivo = new File("src\\arquivo.txt");
        if (arquivo.exists()){

            try {
                BufferedReader bufferedReader = new BufferedReader(new  FileReader(arquivo));
                String linha;
                while ((linha = bufferedReader.readLine()) !=null){
                    System.out.println(linha);
                }
                bufferedReader.close();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
