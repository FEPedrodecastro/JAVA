package Ficha_06;

import java.util.Scanner;

public class ex_10 {

    public static int[] lerNumeros(int[] array) {
        Scanner input = new Scanner(System.in);

        // Loop para ler os números e armazená-los no array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static boolean crescente(int[] vetor) {
        boolean ordemCrescente = true;

        // Percorre o array a vereficar ordem
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                ordemCrescente = false;
                break;
            }
        }

        return ordemCrescente;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = input.nextInt();

        int[] numeros = new int[quantidade];

        // Chama a função lerNumeros e armazenar no array
        lerNumeros(numeros);

        // Chama a função crescente
        boolean ordemCrescente = crescente(numeros);

        // imprimir se esta crescente ou nao
        if (ordemCrescente) {
            System.out.println("Os elementos estão em ordem crescente.");
        } else {
            System.out.println("Os elementos não estão em ordem crescente.");
        }
    }
}


