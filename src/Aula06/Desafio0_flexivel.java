package Aula06;

import java.util.Scanner;

public class Desafio0_flexivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de usuarios que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        String[] cabecario = {"ID", "Nome", "Telefone", "Email"};
        String[][] matizCadastro = new String[qtdUsuarios + 1][cabecario.length];
        matizCadastro[0] = cabecario;

        System.out.println("Prencha os dados a seguir");
        for (int linhas = 1; linhas < matizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecario.length; colunas++) {
                System.out.print(cabecario[colunas]+ ": ");
                matizCadastro[linhas][colunas] = scanner.nextLine();
            }
        }
        String tabela = "";
        for (int linhas = 0; linhas < matizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecario.length; colunas++) {
                tabela += matizCadastro[linhas][colunas];
                tabela += colunas == 0? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);

    }
}