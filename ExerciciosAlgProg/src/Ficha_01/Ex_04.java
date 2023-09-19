package Ficha_01;

// Import obrigatorio do Scanner
import java.util.Scanner;

//Escreva um programa para calcular a área dacircunferência.As dimensões devem ser requisitadas ao utilizador.

public class Ex_04 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 4 *****");

        // Declarar as variáveis
        double raio, area;

        // Declarar constantes
        final double PI = 3.1415926;

        // Ler valor do utilizador
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a area da circunferencia pi*(raio*raio)
        area= PI*(raio*raio);

        // Apresentar a area
        System.out.println("Area :"+area);
    }
}
