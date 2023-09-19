package ex_06;

public class Main {
    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();

        minhaCalculadora.adicao(5.0, 3.0);
        minhaCalculadora.subtracao(10.0, 4.0);
        minhaCalculadora.multiplicacao(6.0, 2.5);
        minhaCalculadora.divisao(8.0, 2.0);
        minhaCalculadora.divisao(5.0, 0.0);
        }
    }