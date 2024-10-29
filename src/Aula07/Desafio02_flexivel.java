package Aula07;

import java.util.Scanner;

public class Desafio02_flexivel {

    static String[][] matrizCadastro = {null};

    public static void main(String[] args) {
        String[] cabecario = {"ID", "Nome", "Telefone", "Email"};

        matrizCadastro[0] = cabecario;
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("\t1 - Para exibir os usuários");
            System.out.println("\t2 - Para cadastrar um usuários");
            System.out.println("\t3 - Para atualizar um usuários");
            System.out.println("\t4 - Para deletar um usuários");
            System.out.println("\t5 - Para sair do programa");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirCadastro(cabecario);
                    break;
                case 2:
                   cadrastrarUsuario(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

    }

    private static void cadrastrarUsuario(Scanner scanner) {
        System.out.print("Digite a quantidade de usuarios que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdUsuarios][matrizCadastro[0].length];

        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }

        System.out.println("Prencha os dados a seguir");

        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();

            }
        }
     matrizCadastro = novaMatriz;
    }

    private static void exibirCadastro(String[] cabecario) {
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecario.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }


    }
