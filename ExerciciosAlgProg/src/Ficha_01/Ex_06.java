package Ficha_01;

// Import obrigatorio do Scanner
import java.util.Scanner;

//Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo utilizador.
// Tendo  em  consideração  os valores  introduzidos,  deverá  também  apresentar  a  média ponderada considerando
// as seguintes ponderações: 20%, 30%, 50%.

public class Ex_06 {

    public static void main(String[] args) {


        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 6 *****");

        // Declarar variáveis
        double num1, num2, num3, media;

        // Ler valores do utilizador
        System.out.println("Insira um numero: ");
        num1 = input.nextDouble();

        System.out.println("Insira um numero: ");
        num2 = input.nextDouble();

        System.out.println("Insira um numero: ");
        num3 = input.nextDouble();


        // Calcular media aritmetica (todos os valores tem o mesmo peso)
       media= (num1+num2+num3)/3;

        // Apresentar a media aritmetica
        System.out.println("Media Aritmetica: "+media);

        // Calcular a media ponderada
        media= (num1*0.2)+(num2*0.3)+(num3*0.5);

        // Apresentar a media ponderada
        System.out.println("Media Ponderada: "+media);
    }
}