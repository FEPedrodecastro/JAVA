package Ficha_05;

import java.util.Scanner;

public class ex_06 {

        public static void main(String[] args) {
            int[] vetor = new int[10];

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite os elementos do array:");

            for (int i = 0; i < vetor.length; i++) {

                vetor[i] = scanner.nextInt();
            }

            boolean OrdemCrescente = true;
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[i - 1]) {
                    OrdemCrescente = false;
                    break;
                }
            }

            if (OrdemCrescente) {
                System.out.println("Os elementos estão em ordem crescente.");
            } else {
                System.out.println("Os elementos não estão em ordem crescente.");
            }
        }
    }
