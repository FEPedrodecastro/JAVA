package Ficha_06;

import java.util.Scanner;

public class ex_07 {

    public static int[] lerNumeros(int[] array) {
        Scanner input = new Scanner(System.in);

        // Loop para ler os números e armazená-los no array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void imprimir(int[] array) {
        // Loop para imprimir os números do array
        for (int i = 0; i < array.length; i++) {
            int numero = array[i];
            // Verifica a posição do número no array para imprimir apropriadamente
            if (i == 0) {
                System.out.print("[" + numero + ",");
            } else if (i == array.length - 1) {
                System.out.print(numero + "]");
            } else {
                System.out.print(numero + ",");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = input.nextInt();

        // Cria um array com o tamanho especificado pelo usuário
        int[] numeros = new int[quantidade];

        // Chama a função lerNumeros para ler os números e armazená-los no array
        lerNumeros(numeros);

        System.out.println("Conteúdo do array:");
        // Chama a função imprimir para exibir os números do array
        imprimir(numeros);
    }
}

