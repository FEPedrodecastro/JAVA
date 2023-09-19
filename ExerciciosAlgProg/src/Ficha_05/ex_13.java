package Ficha_05;

import java.util.Scanner;

public class ex_13 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int soma=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz:");


// Ler os elementos da matriz

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("Introduza um valor[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print("\t| ");
                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }

// Calcular a soma dos elementos da diagonal principal
        for (int i = 0; i < 4; i++) {
            soma += matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + soma);
    }
}