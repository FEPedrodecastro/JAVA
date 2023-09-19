package Ficha_05;

import java.util.Scanner;

public class ex_05{

    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        double soma=0,media=0;

        // Ciclo para introduzir numeros no vetor
        for(int i=0; i<vetor.length; i++) {

            System.out.print("Introduza um preço de um produto[" + i + "]: ");
            vetor[i] = input.nextInt();
        //calcular media
            soma += vetor[i];
            media = (soma/ vetor.length);

        }
        System.out.println("Media: "+ media);

    }

}