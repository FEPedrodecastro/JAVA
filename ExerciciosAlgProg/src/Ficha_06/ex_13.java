package Ficha_06;

import java.util.Scanner;

public class ex_13 {

    // Loop para desenhar
    public static void desenhar(char caracter, int numLinhas, int numColunas) {
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                if (i == 0 || i == numLinhas - 1 || j == 0 || j == numColunas - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //declarar variaveis
            int numLinhas,numColunas;
            char caracter;


            System.out.print("Introduza um caracter: ");
            caracter = scanner.next().charAt(0);

            System.out.print("Introduza o número de linhas: ");
            numLinhas = scanner.nextInt();

            System.out.print("Introduza o número de colunas: ");
            numColunas = scanner.nextInt();

            desenhar(caracter, numLinhas, numColunas);
        }

    }

