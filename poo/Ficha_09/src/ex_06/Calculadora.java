package ex_06;

    public class Calculadora {

        public void adicao(double num1, double num2) {
            double resultado = num1 + num2;
            System.out.println("Resultado da adição: " + resultado);
        }

        public void subtracao(double num1, double num2) {
            double resultado = num1 - num2;
            System.out.println("Resultado da subtração: " + resultado);
        }

        public void multiplicacao(double num1, double num2) {
            double resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + resultado);
        }

        public void divisao(double num1, double num2) {
            if (num2 != 0) {
                double resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
        }


    }

