package Ficha_05;

import java.util.Scanner;

public class ex_11 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz:");


// Ler os elementos da matriz

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Introduza um valor[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

// Encontrar o maior e o menor valor na matriz

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                System.out.print(matriz[i][j]);
                System.out.print("\t"+" "+"\t");
            }
            System.out.println();
        }

        System.out.println("O maior valor na matriz é: " + maior);
        System.out.println("O menor valor na matriz é: " + menor);
    }
}

