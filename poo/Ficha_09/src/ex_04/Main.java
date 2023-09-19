package ex_04;

import ex_03.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        final double p = 3.1415;

        double circunferencia = 2*p*circulo.getRaio() ;
        double area = p*(circulo.getRaio()*circulo.getRaio());

        // Exibindo os resultados
        System.out.println("Circunferência do círculo: " + circunferencia);
        System.out.println("Área do círculo: " + area);
    }
}



