package Ficha_03;

import java.util.Scanner;

public class ex_06_PC {

    public static void main(String[] args) {

        System.out.println("****** Exercício 6 ******");

        // Declarar variaveis
        int numero, nranterior = 1, nrdepois = 1;

        // Criar uma instância do Scanner para leitura de input
        Scanner input = new Scanner(System.in);

        // Ler o número
        System.out.print("Introduza um numero:");
        numero = input.nextInt();

        // Imprimir números anteriores
        while (nranterior <= 5) {
            int anteriores = numero - nranterior;

            System.out.println(anteriores);
            nranterior++;
        }

        // Imprimir números posteriores
        while (nrdepois <= 5) {
            int depois = numero + nrdepois;

            System.out.println(depois);
            nrdepois++;
        }


    }
}