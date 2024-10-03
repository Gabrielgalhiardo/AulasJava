package Aula07.Exercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        float fahrenheit,celsius= 34.F;
        fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println(celsius + " em fahrenheit é: " + fahrenheit + "F");

    }
    static float converterCelsiusParaFahrenheit (float celsius){
        return celsius * 1.8F + 32F;
    }
}