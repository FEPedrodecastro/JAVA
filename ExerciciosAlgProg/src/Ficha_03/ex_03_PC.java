package Ficha_03;

import java.util.Scanner;

public class ex_03_PC {

    public static void main (String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 3 ******");

        // Declarar variaveis
        int numero=0,numb;

        //Ler numero

        System.out.print("Introduza um numero:");
        numb= input.nextInt();

        while (numero <= numb ) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}