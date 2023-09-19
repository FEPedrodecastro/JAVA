package Ficha_05;

import java.util.Scanner;

public class ex_10 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz:");


// Ler os elementos da matriz

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduza um valor[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("\t |");
            }
            System.out.println();
        }

            System.out.println("Digite um valor para procurar na matriz:");
            int valorBusca = scanner.nextInt();

            // numero de vezes que o valor se repete na matriz
            int contador = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matriz[i][j] == valorBusca) {
                        contador++;
                    }
                }
            }

            System.out.println("O valor " + valorBusca + " aparece " + contador + " vezes na matriz.");
        }
    }
