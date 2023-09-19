package Ficha_04;

import java.util.Scanner;

public class ex_01_PC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        int opcao;
        String resposta;

        do {
        do {
            System.out.print("Introduza o 1º número: ");
            num1 = input.nextInt();

            System.out.print("Introduza o 2º número: ");
            num2 = input.nextInt();

            System.out.println("1 - Soma (+)");
            System.out.println("2 - Subtracção (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");

            System.out.print("Escolha a opção pretendida: ");
            opcao = input.nextInt();

        } while (opcao < 1 || opcao > 4);
        switch (opcao) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(+num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(+num1 + " / " + num2 + " = " + (num1 / num2));
                break;
        }
        System.out.print("Deseja continuar? (s/n): ");
        resposta = input.next();
        resposta = resposta.toLowerCase();

    } while (!resposta.equals("n"));
    // or: while (resposta.equals("s"));
}
}