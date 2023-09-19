package Ficha_05;

import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor=vetor[0];

        // Ciclo para introduzir numeros no vetor
        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Introduza um elemento [" + i + "]: ");
            vetor[i] = input.nextInt();

            if (i==0 || vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("O menor elemento é " + menor);
    }
}