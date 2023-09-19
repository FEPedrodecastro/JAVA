package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_02 {
    public static double media(double num1,double num2,double num3) {


        double soma,media;

        soma = num1 + num2 + num3;
        media = soma / 3.0;
        return media;
    }

    public static void main(String[] args) {

        //Instanciar  scanner
        Scanner scanner = new Scanner(System.in);

        //declar variavel
        double media,num1, num2,num3;

        //ler do utilizador o  numero
        System.out.print("Introduza um número : ");
        num1 = scanner.nextDouble();
        System.out.print("Introduza um número: ");
        num2 = scanner.nextDouble();
        System.out.print("Introduza um número: ");
        num3 = scanner.nextDouble();

        //chama funçao
        media=media(num1,num2,num3);
        System.out.println("Resultado da média dos números inseridos: "+media);

    }
}
