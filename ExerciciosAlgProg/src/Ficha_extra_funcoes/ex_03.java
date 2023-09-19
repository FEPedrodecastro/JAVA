package Ficha_extra_funcoes;

import java.util.Scanner;

public class ex_03 {
    public static double area(double comprimento,double largura) {

        double area;

        area = comprimento * largura;
        return area;
    }

    public static void main(String[] args) {

        //Instanciar  scanner
        Scanner scanner = new Scanner(System.in);

        //declar variavel
        double arearec,comprimento, largura;

        //ler do utilizador o  numero
        System.out.print("Introduza a largura : ");
        largura = scanner.nextDouble();
        System.out.print("Introduza o comprimento: ");
        comprimento = scanner.nextDouble();


        //chama funçao
        arearec=area(comprimento,largura);
        System.out.println("Área: "+arearec);

    }
}
