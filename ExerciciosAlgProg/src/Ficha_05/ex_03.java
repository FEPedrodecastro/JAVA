package Ficha_05;

import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maior=vetor[0];

        // Ciclo para introduzir números no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Introduza um valor[" + i + "]: ");
            vetor[i] = input.nextInt();

            if (i==0 || vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("O maior valor é " + maior);
    }
}
