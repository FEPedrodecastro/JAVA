package Ficha_04;

import java.util.Scanner;

public class ex_04_PC {

    public static void main (String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 4 ******");

        //Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo
        // um número natural que possui dois divisores: 1 e ele mesmo).

        //declarar variaveis

        int numb,resto=2;
        double decimal;

        System.out.println("Introduza um número:");
        numb= input.nextInt();

        if (numb < 2) {
            System.out.println("O número não é primo.");
        } else if (numb == 2) {
            System.out.println("O número é primo.");
        } else if (numb % 2 == 0) {
            System.out.println("O número não é primo.");
        } else {
            boolean primo = true;
            int limite = (int) Math.sqrt(numb);

            for (int i = 3; i <= limite; i += 2) {
                if (numb % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }
    }
}