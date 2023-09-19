package Ficha_01;

// Import obrigatorio do Scanner
import java.util.Scanner;

//Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2.
// Permute o valor das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar
// esta troca sem criar variáveis adicionais

public class Ex_07 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 7 *****");

        // Declarar variáveis
        int valor1,valor2;

        // Ler valores do utilizador
        System.out.print("Insira um numero: ");
        valor1 = input.nextInt();

        System.out.print("Insira um numero: ");
        valor2 = input.nextInt();

        // Imprimir os valores inseridos
        System.out.println("\nValor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);

        // Lógica de troca
       valor1=valor1+valor2;
       valor2=valor1-valor2;
       valor1=valor1-valor2;


        // Apresentar os valores trocados
        System.out.println("\nValor 1 Trocado: "+valor1);
        System.out.println("Valor 2 Trocado: "+valor2);
    }
}
