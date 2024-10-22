package Aula06;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de usuarios que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        String[] cabecario = {"ID", "Nome", "Telefone", "Email"};
        String[][] matizCadastro = new String[qtdUsuarios + 1][4];
        matizCadastro[0] = cabecario;

        System.out.println("Prencha os dados a seguir");
        for (int linhas = 1; linhas < matizCadastro.length; linhas++) {
            System.out.print("ID: ");
            matizCadastro[linhas][0] = scanner.nextLine();
            System.out.print("Nome: ");
            matizCadastro[linhas][1] = scanner.nextLine();
            System.out.print("Telefone: ");
            matizCadastro[linhas][2] = scanner.nextLine();
            System.out.print("Email: ");
            matizCadastro[linhas][3] = scanner.nextLine();

        }

        for (int linhas = 0; linhas < matizCadastro.length; linhas++) {
            System.out.println(matizCadastro[linhas][0]+"\t\t"+matizCadastro[linhas][1]+"\t\t\t" + matizCadastro[linhas][2]+"\t\t\t" + matizCadastro[linhas][3]);

        }
    }
}