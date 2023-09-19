package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_09 {
    static String mesesAno(int mes) {
        String[] meses = new String[12]; // Exemplo, quantas mais piadas melhor :D
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Sete";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        if (mes >= 1 && mes <= meses.length) {
            return meses[mes - 1];
        } else {
            return "Opção Inválida. Um ano só tem " + meses.length + " meses.";
        }
    }

    public static void main(String[] args) {

        //Instanciar  scanner
        Scanner input = new Scanner(System.in);

        //declar variavel
        int nrMes;

        //ler do utilizador o  numero
        System.out.print("Introduza um número: ");
        nrMes = input.nextInt();

        //chamar função
        System.out.println(mesesAno(nrMes));
        input.nextInt();
    }
}
