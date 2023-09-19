package Ficha_04;

import java.util.Scanner;

public class ex_02_PC {

    public static void main(String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: Criar");
                    break;
                case 2:
                    System.out.println("Opção escolhida: Atualizar");
                    break;
                case 3:
                    System.out.println("Opção escolhida: Eliminar");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        } while (opcao != 4);

        System.out.println("Programa encerrado.");
    }
}