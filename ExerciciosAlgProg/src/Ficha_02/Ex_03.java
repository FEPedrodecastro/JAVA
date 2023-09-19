package Ficha_02;

// Import obrigatorio do Scanner
import java.util.Scanner;

//Determine e escreva o montante de impostos a pagar sobre um salário anual lido,
// tendo em conta o seguinte:
// a.Salário até 15.000€ inclusive paga taxa de 20%
// b.Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
// c.Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
// d.Salário superior a 25.000€ paga taxa de 40%

public class Ex_03 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double salario;

        // Ler valores do utilizador
        System.out.print("Insira o salario: ");
        salario = input.nextDouble();


        if(salario<=15000){
            System.out.println("Montante de impostos a pagar e 20 porcento: "+ salario*0.2);
        }else if(salario<=20000){
            System.out.println("Montante de impostos a pagar e 30 porcento: "+ salario*0.3);
        }else if( salario<=25000){
            System.out.println("Montante de impostos a pagar e 35 porcento: "+ salario*0.35);
        }else{
            System.out.println("Montante de impostos a pagar e 40 porcento: "+ salario*0.4);
        }
    }
}