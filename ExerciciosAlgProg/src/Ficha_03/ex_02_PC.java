package Ficha_03;

import java.util.Scanner;

public class ex_02_PC {

    public static void main(String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 2 ******");

        // Declarar variaveis
        int numero=531;

        while (numero <= 750) {
            System.out.println(numero);
            numero = numero + 2;
        }

    }
}
