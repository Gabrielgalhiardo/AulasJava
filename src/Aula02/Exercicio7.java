package Aula02;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean Cond1 = true;
        boolean Cond2 = false;
        boolean Cond3 = true;
        char espaco = 32;

        System.out.println(espaco);
        System.out.println("Comparação && onde ambas condições devem ser true para o resultado final ser true.");
        System.out.println("Cond1= " + Cond1 + "; Cond2= " + Cond2 + "; então && = " + (Cond1 && Cond2));
        System.out.println("Cond2= " + Cond2 + "; Cond3= " + Cond3 + "; então && = " + (Cond2 && Cond3));
        System.out.println("Cond1= " + Cond1 + "; Cond3= " + Cond3 + "; então && = " + (Cond1 && Cond3));
        System.out.println(espaco);
        System.out.println("Comparação || onde se qualquer condição for true o resultado final é true.");
        System.out.println("Cond1=" + Cond1 + "; Cond2=" + Cond2 + "; então || = " + (Cond1 || Cond2));
        System.out.println("Cond2=" + Cond2 + "; Cond3=" + Cond3 + "; então || = " + (Cond2 || Cond3));
        System.out.println("Cond1=" + Cond1 + "; Cond3=" + Cond3 + "; então || = " + (Cond1 || Cond3));
    }
}
