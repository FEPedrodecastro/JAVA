package Ficha_03;

import java.util.Scanner;

public class ex_07_PC {

    public static void main(String[] args) {

        // Declarar variaveis
        int numero=0,soma=0,media=0,cont=0;

        // Criar uma instância do Scanner para leitura de input
        Scanner input = new Scanner(System.in);

        // Ler o número

        while (numero!=-1) {
            System.out.println("Advinha um número:");
            numero = input.nextInt();

            if (numero != -1) {

                soma = soma + numero;
                cont = cont + 1;
            }
        }

        media=soma/cont;
        System.out.println("Resultado da média dos números inseridos:"+media);


            }

        }



