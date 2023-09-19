package Ficha_06;

import java.util.Scanner;

public class ex_04 {

    //função de verificar se um numero e primo
    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false; // números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false; // número é divisível por i, não é primo
            }
        }

        return true; // número é primo
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


        //chamar função e imprimir
        resultado = primo(numero);
        System.out.println("O número " + numero + " é primo? " + resultado);
    }
}
