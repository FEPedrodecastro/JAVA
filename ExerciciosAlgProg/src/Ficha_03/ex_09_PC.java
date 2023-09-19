package Ficha_03;

import java.util.Scanner;

public class ex_09_PC {

    public static void main(String[] args) {


        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 9 ******");


        // Declarar variaveis
        int numero=0,numb1,x;

        System.out.println("Escreve um número:");
        numb1 = input.nextInt();

        System.out.println("Escreve um número de salto:");
        x = input.nextInt();

        while (numero <= numb1) {
            System.out.println(numero);
            numero = numero + x;
        }
    }
}