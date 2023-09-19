package Ficha_extra;
// Import obrigatorio do Scanner
import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double peso,pesolua;

        // Ler peso do utilizador
        System.out.print("Insira o seu peso em Kg: ");
        peso= input.nextInt();

        //Peso lua
        pesolua=peso*0.16;


        if(peso>0){
            System.out.println("O seu peso na lua é:"+pesolua);

        }else{
                System.out.println("Peso introduzido invalido");
        }

    }


}