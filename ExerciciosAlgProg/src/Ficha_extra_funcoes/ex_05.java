package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_05 {
    static String contarPiada(int piada) {
        String[] bibliotecaPiadas = new String[13]; // Exemplo, quantas mais piadas melhor :D
        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida? Foice";
        bibliotecaPiadas[1] = "O que 17 alentejanos fazem em frente ao cinema? À espera que chege mais um porque o filme é para mais de 18.";
        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] = "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";

        if (piada >= 1 && piada <= bibliotecaPiadas.length) {
            return bibliotecaPiadas[piada - 1];
        } else {
            return "A biblioteca de piadas só tem " + bibliotecaPiadas.length + " piadas.";
        }
    }

    public static void main(String[] args) {

        //Instanciar  scanner
        Scanner input = new Scanner(System.in);

        //declar variavel
        int numPiada;

        //ler do utilizador o  numero
        System.out.print("Introduza um número para ouvir uma piada: ");
        numPiada = input.nextInt();

        //chamar função
        System.out.println(contarPiada(numPiada));
        input.nextInt();
    }
}
