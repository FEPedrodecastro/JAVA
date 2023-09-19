package Ficha_05;

import java.util.Scanner;

public class ex_09 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int soma=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz:");


// Ler os elementos da matriz

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("Introduza um valor[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; //soma dos elementos
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

            System.out.print("\t| ");
                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}