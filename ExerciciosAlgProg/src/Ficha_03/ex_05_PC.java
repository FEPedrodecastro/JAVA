package Ficha_03;

import java.util.Scanner;

public class ex_05_PC {

    public static void main(String[] args) {

        // Instanciar Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 5 ******");

        // Declarar variaveis
        int numero = 1,soma=0;


        //imprima 1-100
        while (numero <= 100) {
            System.out.println(numero);
            soma += numero;
            numero = numero + 1;

        }
            System.out.println("Soma: " + soma);
    }
}