package Ficha_extra_funcoes;

import java.util.Scanner;


public class ex_08 {
    public static boolean vogal(String letra) {

        // +1 caracter não é uma letra
        if (letra.length() != 1) {

            return false;
        }

        // caractere da string
        char a = letra.charAt(0);

        // Coloca o caractere em letra minuscula
        a = Character.toLowerCase(a);

        // Verificar se é uma vogal
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Teste do método vogal()
        System.out.print("Introduza uma letra: ");
        String input = System.console().readLine();

        boolean resultado = vogal(input);

        if (resultado) {
            System.out.println("Vogal");
        } else {
            System.out.println("Não é vogal");
        }
    }
}
