package Aula04.Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        int horasTrabalhadasPorS = 44;
        float valorPorHora = 10.0F;

        if (horasTrabalhadasPorS > 40) {
            System.out.println("Você vai receber: " + ((horasTrabalhadasPorS - 40) * (valorPorHora * 1.5)) + "R$ Pelas suas extras");
            System.out.println("Juntando o seu salário e extras ficou: "+ (( horasTrabalhadasPorS * valorPorHora ) + (horasTrabalhadasPorS - 40) * (valorPorHora * 1.5)));
        } else if (horasTrabalhadasPorS<40 && horasTrabalhadasPorS >= 1) {
            System.out.println("Você não fez horas extras, ficando com o salário de: " + (horasTrabalhadasPorS * valorPorHora) + "R$");
        }else{
        System.out.println("TENTE OUTRO NUMERO DE HORAS");
        }
    }
}
