package Aula04;

public class Exemplos {
    public static void main(String[] args) {
        System.out.println("---------------------------------Exemplo-1---------------------------");

        int x = 221;
        boolean condicao = x > 30;
        if (condicao) {
            System.out.println("É maior que 30 \n " + "x = " + x);
        } else {
            System.out.println("É menor que 30 \n " + "x=" + x);
        }

        //exemplo 2
        System.out.println("---------------------------------Exemplo-2---------------------------");

        String corSemafaro = "vermelha";
        if (corSemafaro == "Verde" || corSemafaro == "verde") {
            System.out.println("Pode passar");
        } else {
            if (corSemafaro == "Amarelo" || corSemafaro == "amarelo") {
                System.out.println("Cuidado");
            } else {
                if (corSemafaro == "Vermelho" || corSemafaro == "vermelho" || corSemafaro == "Vermelha" || corSemafaro == "vermelha") {
                    System.out.println("Não vai passar");
                } else {
                    System.out.println("O semafaro ta quebrado");
                }
            }
        }
        //exemplo 2.1
        System.out.println("---------------------------------Exemplo-2.1-------------------------");

        if (corSemafaro == "Verde" || corSemafaro == "verde") {
            System.out.println("Pode passar");
        } else if (corSemafaro == "Amarelo" || corSemafaro == "amarelo") {
            System.out.println("Cuidado");
        } else if (corSemafaro == "Vermelho" || corSemafaro == "vermelho") {
            System.out.println("Não vai passar");
        } else {
            System.out.println("O semafaro ta quebrado");
        }


        //Exemplo 3
        System.out.println("---------------------------------Exemplo-3---------------------------");

        int idade = 19;

        if (idade <= 12 && idade > 0) {
            System.out.println("Sua idade é " + idade + " anos.\nE voce é uma Criança");
        } else if (idade >= 13 && idade < 18) {
            System.out.println("Sua idade é " + idade + " anos.\nE voce é um Adolecente");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Sua idade é " + idade + " anos.\nE voce é um Adulto");
        } else if (idade > 65) {
            System.out.println("Sua idade é " + idade + " anos.\nE voce é um Idoso");
        } else {
            System.out.println("Escreva um Número correto Igor");
        }


        System.out.println("---------------------------------Exemplo-4---------------------------");
        //operador ternario
        x = 50;
        boolean r;
        r = x > 30 ? true : false;
        System.out.println(r);

        System.out.println("---------------------------------Exemplo-5---------------------------");

        String maioridade;
        maioridade = idade > 18 ? "maior de idade" : "menor de idade";
        System.out.println("Você é " + maioridade);

        System.out.println("---------------------------------Exemplo-5---------------------------");
        float preco= 90;
        float desconto;
       desconto = preco>80 ? 0.25F : 0;
        System.out.println("O valor final do produto com desconto = " + (preco - preco*desconto) + "Reais");

       //if (preco>80){
          // System.out.println("O produto custa = " + preco + " Reais\nCom desconto = 25%" + "\nValor final = " + (preco - preco*desconto) + " Reais");
      // }else {
        //   System.out.println("O produto ficou no valor de = " + (preco - preco*desconto) + "Reais");
     //  }

    }
}
