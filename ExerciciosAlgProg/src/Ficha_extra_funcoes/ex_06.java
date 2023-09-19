package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_06 {

    public static int somatorio(int numero) {

        //variavel soma
        int somatorio = 0,digito;

        // Verifica cada dígito do número
        while (numero > 0) {
            digito = numero % 10; // Obtém o último dígito
            somatorio += digito; // Soma ao somatório
            numero /= 10; // Remove o último dígito do número
        }

        return somatorio;
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
        resultado = somatorio(numero);
        System.out.println("Somatório dos dígitos: " + resultado);
    }
}

