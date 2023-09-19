package Ficha_06;

import java.util.Scanner;

public class ex_14 {

    //somar matrizes
    public static void soma(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        imprimirMatriz(resultado);
    }

    //somatorio dos Elementos das Matrizes
    public static int somatorioElementos(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int somatorio = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somatorio += matriz1[i][j] + matriz2[i][j];
            }
        }

        return somatorio;
    }

    public static void imprimirMatriz(int[][] matriz) {

        //declarar variaveis
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        //
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matriz2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        soma(matriz1, matriz2);

        int somatorio = somatorioElementos(matriz1, matriz2);
        System.out.println("Somatório dos elementos das matrizes: " + somatorio);
    }
}
