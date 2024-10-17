package Aula08.Exemplos;

public class Exercicio08 {
    public static void main(String[] args) {
        String linha = "ID:1 ;Nome:Rafael ; Idade:39 ";
        String[] tokens = linha.split(";");

        for (String token : tokens) {
            System.out.println(token);
        }

        String valor = "";
        for (int i = 0; i < tokens.length; i++) {
            String[] chaveValor = tokens[i].split(":");
            valor += chaveValor[1].trim() + ",";
        }
        System.out.println(valor);

        String[] idade = tokens[2].split(":");

        int valorIdade =Integer.parseInt(idade[1].trim());


        System.out.println("Agora a idade é: " + (valorIdade+1) + " anos.");

    }
}
