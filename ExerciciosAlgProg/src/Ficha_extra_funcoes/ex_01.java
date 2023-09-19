package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_01 {

    public static int menorNumero(int num1,int num2,int num3) {

        //função com condição do menor numero e impressão
        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        } else if (num3 < menor) {
            menor = num3;
        }
        System.out.println("Menor número: " + menor);
        return menor;
    }

    public static void main(String[] args) {
        //Instanciar  scanner
        Scanner scanner = new Scanner(System.in);

        //declarar variaveis
        int num1, num2, num3, menor;

        //ler do utilizador o  numero
        System.out.print("Introduza um número : ");
        num1 = scanner.nextInt();
        System.out.print("Introduza um número: ");
        num2 = scanner.nextInt();
        System.out.print("Introduza um número: ");
        num3 = scanner.nextInt();
        //chamar função
        menorNumero(num1,num2,num3);
    }
}
