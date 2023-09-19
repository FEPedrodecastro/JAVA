package Ficha_06;

import java.util.Scanner;

public class ex_02 {

    //função de verificar paridade
    public static boolean paridade(int numero) {
        if (numero % 2 == 0) {
            return true; // número é par
        } else {
            return false; // número é ímpar
        }
    }
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);


        //declarar variavel
        int numero;
        boolean resultado;

        //ler do utilizador o  numero
        System.out.print("Introduza o numero: ");
        numero=input.nextInt();


        //chamar função e imprimir a paridade
        resultado = paridade(numero);
        System.out.println("O número " + numero + " é par? " + resultado);
    }
}
