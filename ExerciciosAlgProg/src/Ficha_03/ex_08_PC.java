package Ficha_03;

import java.util.Scanner;

public class ex_08_PC {

    public static void main(String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 8 ******");


        // Declarar variaveis
        int numero=2,numb1;

        System.out.println("Escreve um número:");
        numb1 = input.nextInt();

        while (numero <= numb1) {
            System.out.println(numero);
            numero = numero + 2;
        }
    }
}