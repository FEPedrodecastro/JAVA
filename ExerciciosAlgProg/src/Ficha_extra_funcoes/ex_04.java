package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_04 {
    public static void tabuada(int numero) {

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {

        //Instanciar  scanner
        Scanner scanner = new Scanner(System.in);

        //declar variavel
        int numero;

        //ler do utilizador o  numero
        System.out.print("Introduza um número : ");
        numero = scanner.nextInt();

        //chama funçao
        System.out.println("Tabuada: "+numero);
        tabuada(numero);

}

}
