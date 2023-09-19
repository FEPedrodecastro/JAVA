package Ficha_05;

import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int soma=0;

        // Ciclo para introduzir numeros no vetor
        for(int i=0; i<vetor.length; i++) {

            System.out.print("Introduza um preço de um produto[" + i + "]: ");
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        System.out.println("A soma do valor dos produtos é " + soma);

    }

}
