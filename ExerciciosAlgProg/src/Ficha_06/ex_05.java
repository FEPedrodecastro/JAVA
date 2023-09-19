package Ficha_06;

import java.util.Scanner;

public class ex_05 {

    //função de verificar se um numero e primo
    public static boolean numPerfeito(int num){

        int divisorSum = 0;

    // Percorrer todos os números de 1 até num / 2
        for(int i = 1; i <=num /2;i++) {
            if (num % i == 0) {
            // Adiciona i à soma dos divisores
            divisorSum += i;
        }
    }
        return divisorSum==num;
    }

        public static void main(String[] args){

            // Instanciar Scanner (linha obrigatória para ler dados da consola)
            Scanner input = new Scanner(System.in);

            //declarar variavel
            int number=0;
            boolean num = numPerfeito(number);

            //ler do utilizador o  numero
            System.out.print("Introduza o numero: ");
            number = input.nextInt();

            //chamar função e imprimir
            boolean nP= numPerfeito(number);


            System.out.println("Número: " + number);
            if (nP) {
                System.out.println("É um número perfeito.");
            } else {
                System.out.println("Não é um número perfeito.");
            }
        }
    }
