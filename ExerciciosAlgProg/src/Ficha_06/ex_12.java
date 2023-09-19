package Ficha_06;

import java.util.Scanner;

public class ex_12 {

    public static int lerInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int valor=-1;

        while (valor < 0) {
            System.out.print("Digite um número inteiro positivo: ");
            valor = input.nextInt();
            if (valor == 0) {
                System.out.println("Opção inválida.");
            } else {
                System.out.println();
            }
        } return valor;
    }

        public static void imprimirAsteriscos (int valor){

            System.out.print("Numeros de asteriscos: ");
            for (int i = 0; i < valor; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        public static void main (String[] args){
            int valor = lerInteiroPositivo();
            imprimirAsteriscos(valor);
        }
}


