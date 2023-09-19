package Ficha_03;

import java.util.Scanner;

public class ex_01_PC {

    public static void main(String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 1 ******");


        // Declarar variaveis
        int numero=2;

        while (numero <= 300) {
            System.out.println(numero);
            numero = numero + 2;
        }
    }
}