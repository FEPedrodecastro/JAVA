package Ficha_extra;// Import obrigatorio do Scanner
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int idade;

        // Ler valores do utilizador
        System.out.print("Insira a sua idade: ");
        idade= input.nextInt();


        if(idade<18){
            System.out.println("É menor de idade.");
        }else if (idade>=18){
                System.out.println("É maior de idade.");
        }
    }
}