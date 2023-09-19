package Ficha_05;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

//leitura de dados para o array1
        for (int i = 0; i < 10; i++){
                System.out.print("Introduza valor para primeiro array[" + i + "]: ");
                array1[i] = scanner.nextInt();
            }


//leitura de dados para o array2
        for (int i = 0; i < 10; i++){
            System.out.print("Introduza valor para segundo array[" + i + "]: ");
            array2[i] = scanner.nextInt();
        }


// Preencher a matriz com elementos dos arrays
        for (int i = 0; i < 10; i++) {
            matriz[i][0] = array1[i];
            matriz[i][1] = array2[i];
        }
        System.out.println("Resultado da Matriz:");

// Imprimir a matriz resultante

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
