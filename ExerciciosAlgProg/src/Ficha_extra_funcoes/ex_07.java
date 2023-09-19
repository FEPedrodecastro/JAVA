package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_07 {

    public static int invertido(int numero) {

        //declarar variaveis
        int inversao = 0,digito;

        // Verifica cada dígito do número
        while (numero != 0) {
            digito = numero % 10; //obtem o ultimo digito
            inversao = inversao * 10 + digito; // inverte e regista o ultimo digito
            numero /= 10; // Remove o último dígito do número
        }
        return inversao;
    }

    public static void main(String[] args) {
        //Instanciar  scanner
        Scanner input = new Scanner(System.in);

        //declar variavel
        int numero,resultado;

        //ler do utilizador o  numero
        System.out.print("Introduza um número de 2 ou mais digitos: ");
        numero = input.nextInt();

        //chamar função
        resultado = invertido(numero);
        System.out.println("Numero invertido: " + resultado);
    }
}

