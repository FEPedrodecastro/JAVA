package Ficha_06;

import java.util.Scanner;

public class ex_11{

    //função exercicio 8
    public static void lerNumeros(int[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
    }

    public static int maior(int[] vetor) {
        int maiorElemento = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
            }
        }

        return maiorElemento;
    }

    public static int menor(int[] vetor) {
        int menorElemento = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
            }
        }

        return menorElemento;
    }

    public static boolean crescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                return false;
            }
        }

        return true;
    }


    public static void exibirMenu(int[] array) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=============MENU=============\n");
            System.out.println("\t1.Maior Elemento do Array");
            System.out.println("\t2.Menor Elemento do Array");
            System.out.println("\t3.Ordem Crescente\n");
            System.out.println("==============================\n");
            System.out.println("Escolha um exercício (1-3) ou 0 para sair:");
            opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("=============OPÇÃO=============\n");
                    System.out.println("Fim do programa.");
                    System.out.println("==============================\n");
                    break;

                case 1:
                    System.out.println("=============OPÇÃO=============\n");
                    System.out.println("1.Maior Elemento do Array");
                    System.out.println("==============================\n");
                    System.out.println("\"O maior elemento do array é: \" ");

                    lerNumeros(array);
                    int maiorElemento = maior(array);
                    System.out.println("O maior elemento do array é: " + maiorElemento);
                    break;

                case 2:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("2.Menor Elemento do Array");
                    System.out.println("==============================\n");
                    System.out.print("Introduza o número: ");

                    lerNumeros(array);
                    int menorElemento = menor(array);
                    System.out.println("O menor elemento do array é: " + menorElemento);
                    break;

                case 3:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("\t3.Ordem Crescente");
                    System.out.println("==============================\n");
                    System.out.print("Introduza o número: ");

                    lerNumeros(array);
                    boolean ordemCrescente = crescente(array);
                    if (ordemCrescente) {
                        System.out.println("Os elementos estão em ordem crescente.");
                    } else {
                        System.out.println("Os elementos não estão em ordem crescente.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
    }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int tamanho;

            System.out.print("Digite o tamanho do array: ");
            tamanho = input.nextInt();

            int[] array = new int[tamanho];

            exibirMenu(array);
        }
    }
