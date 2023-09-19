package Ficha_06;

import java.util.Scanner;

public class ex_06 {

    //função exercicio 1
    public static void fazerBarulho(String animal) {
        switch (animal.toUpperCase()) {
            case "CAO":
                System.out.println("Au au au!");
                break;

            case "GATO":
                System.out.println("Miau!");
                break;

            case "PEIXE":
                System.out.println("Glub Glub Glub");
                break;

            case "VACA":
                System.out.println("Muuuuuuuu!");
                break;

            case "PORCO":
                System.out.println("Oinc! Oinc! Oinc!");
                break;

            default:
                System.out.println("Barulho Indefinido");
                break;
        }
    }

    //função exercicio 2
    public static boolean paridade(int numero) {
        return numero % 2 == 0;
    }

    //função exercicio 3
    public static boolean positividade(int numero) {
        return numero >= 0;
    }

    //função exercicio 4
    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    //função exercicio 5
    public static boolean numPerfeito(int num) {
        int divisorSum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum == num;
    }

    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        //declarar variavel
        int exercicio;

        //ler do utilizador o  numero
        // menu com ciclo para chamar função

        do {
            System.out.println("=============MENU=============\n");
            System.out.println("\t1.Barulho do Animal");
            System.out.println("\t2.Paridade Numérica");
            System.out.println("\t3.Positividade Numérica");
            System.out.println("\t4.Número Primo");
            System.out.println("\t5.Número Perfeito\n");
            System.out.println("==============================\n");
            System.out.println("Escolha um exercício (1-5) ou 0 para sair:");
            exercicio = input.nextInt();

            switch (exercicio) {
                case 0:
                    System.out.println("=============OPÇÃO=============\n");
                    System.out.println("Fim do programa.");
                    System.out.println("==============================\n");
                    break;

                case 1:
                    System.out.println("=============OPÇÃO=============\n");
                    System.out.println("1.Barulho do Animal");
                    System.out.println("==============================\n");
                    System.out.println("CAO");
                    System.out.println("GATO");
                    System.out.println("PEIXE");
                    System.out.println("VACA");
                    System.out.println("PORCO\n");
                    System.out.println("Escolha um animal: ");

                    String animalEscolhido = input.next();
                    fazerBarulho(animalEscolhido);
                    break;

                case 2:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("2.Paridade Numérica");
                    System.out.println("==============================\n");
                    System.out.print("Introduza o número: ");

                    int numeroPar = input.nextInt();
                    boolean resultadoPar = paridade(numeroPar);
                    System.out.println("\nO número " + numeroPar + " é par? " + resultadoPar);
                    break;

                case 3:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("\t3.Positividade Numérica");
                    System.out.println("==============================\n");
                    System.out.print("Introduza o número: ");

                    int numeroPositivo = input.nextInt();
                    boolean resultadoPositivo = positividade(numeroPositivo);
                    System.out.println("O número " + numeroPositivo + " é positivo? " + resultadoPositivo);
                    break;

                case 4:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("\t4.Número Primo");
                    System.out.println("==============================\n");
                    System.out.print("Introduza o número: ");

                    int numeroPrimo = input.nextInt();
                    boolean resultadoPrimo = primo(numeroPrimo);
                    System.out.println("O número " + numeroPrimo + " é primo? " + resultadoPrimo);
                    break;

                case 5:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("\t5.Número Perfeito");
                    System.out.println("==============================\n");
                    System.out.print("Introduza o número: ");

                    int numeroPerfeito = input.nextInt();
                    boolean resultadoPerfeito = numPerfeito(numeroPerfeito);
                    System.out.println("O número " + numeroPerfeito + " é perfeito? " + resultadoPerfeito);
                    break;

                default:
                    System.out.println("=============OPÇÃO=============");
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("==============================\n");
                    break;
            }

            System.out.println();
        } while (exercicio != 0);
    }
}