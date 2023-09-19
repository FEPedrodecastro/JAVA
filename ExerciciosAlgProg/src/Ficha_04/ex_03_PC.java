package Ficha_04;

import java.util.Scanner;

public class ex_03_PC {

    public static void main (String[] args) {

        //Instanciar Scanner (linha obrigatoria para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 3 ******");

        //Crie  um  jogo,  que  peça  ao  jogador  1  um  valor  entre  0  e  100.  De  seguida,  deverá  permitir
        // ao  jogador  2  tentar  acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for
        // descoberto, deverá informar se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido
        // pelo jogador 1. No final (quando o valor é descoberto) deverá apresentar o número de tentativas que o
        // jogador 2 necessitou para acertar.


                // Jogador 1 escolhe um valor
                System.out.print("Jogador 1, escolha um valor entre 0 e 100: ");
                int valorEscolhido = input.nextInt();

                // Validação do valor escolhido pelo Jogador 1
                if (valorEscolhido < 0 || valorEscolhido > 100) {
                    System.out.println("Valor inválido. O jogo será encerrado.");
                    System.exit(0);
                }

                int tentativas = 0;
                int palpite;

                // Jogador 2 tenta adivinhar o valor
                do {
                    System.out.print("Jogador 2, faça um palpite: ");
                    palpite = input.nextInt();
                    tentativas++;

                    if (palpite < valorEscolhido) {
                        System.out.println("Valor incorreto! O valor escolhido é maior.");
                    } else if (palpite > valorEscolhido) {
                        System.out.println("Valor incorreto! O valor escolhido é menor.");
                    } else {
                        System.out.println("Parabéns! Você acertou o valor em " + tentativas + " tentativas.");
                    }
                } while (palpite != valorEscolhido);


            }
        }
