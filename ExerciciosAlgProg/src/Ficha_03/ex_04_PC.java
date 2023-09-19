package Ficha_03;

import java.util.Scanner;

public class ex_04_PC {

    public static void main (String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 4 ******");

        // Declarar variaveis
        int numero,numb1,numb2;

        // Ler numb1
        System.out.print("Introduza um numero para inicio de intervalo:");
        numb1=input.nextInt();

        //Ler numb2
        System.out.print("Introduza um numero para fim de intervalo:");
        numb2= input.nextInt();

        numero=numb1+1;

        while (numero< numb2 ) {
            System.out.println(numero);
             numero= numero + 1;
        }
    }
}

