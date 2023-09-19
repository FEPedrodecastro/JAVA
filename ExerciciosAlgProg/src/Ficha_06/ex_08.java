package Ficha_06;

import java.util.Scanner;

public class ex_08 {

    public static int[] lerNumeros(int[] array) {
        Scanner input = new Scanner(System.in);

        // Loop para ler os números e armazená-los no array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int maior(int[] vetor) {

        // Assume o primeiro elemento como o maior
        int maiorElemento = vetor[0];

        // Percorre o array a partir do segundo elemento
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorElemento) {
                // Atualiza o maior valor
                maiorElemento = vetor[i];
            }
        }
        return maiorElemento;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //quantidade de numeros que user quer introduzir
        System.out.print("Quantos números deseja inserir? ");
        int quantidade = input.nextInt();

        //introduzir nueros no array e chamar função
        int[] numeros = new int[quantidade];
        lerNumeros(numeros);

        //chamar função para encontrar maior numero
        int maiorElemento = maior(numeros);

        System.out.println("O maior elemento do array é: " + maiorElemento);
    }
}
