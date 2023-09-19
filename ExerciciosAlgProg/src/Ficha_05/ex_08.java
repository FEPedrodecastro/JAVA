package Ficha_05;

import java.util.Scanner;

public class ex_08 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduza um valor[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
