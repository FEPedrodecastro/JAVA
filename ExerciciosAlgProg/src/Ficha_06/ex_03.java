package Ficha_06;

import java.util.Scanner;

public class ex_03 {

    //função de verificar positividade ou negatidade de um numero


    public static boolean positividade(int numero) {
        if (numero >= 0) {
            return true; // número é positivo
        } else {
            return false; // número é negativo
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
        resultado = positividade(numero);
        System.out.println("O número " + numero + " é positivo? " + resultado);
    }
}
