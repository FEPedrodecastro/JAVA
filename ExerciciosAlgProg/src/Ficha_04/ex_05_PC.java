package Ficha_04;

import java.util.Scanner;

public class ex_05_PC {

    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("****** Exercício 5 ******");
        String codigo;
        System.out.println("Introduza o seu código de funcionário:");
        codigo = input.next();

        int cargo, salario = 0, dia = 1;
        double bonus = 1, vencimento = 1, subsidio = 1, irs = 1, ssFuncionario, ssEmpresa;

        do {
            System.out.println("=== CARGO ===");
            System.out.println("1. Empregado");
            System.out.println("2. Chefe");
            System.out.println("3. Administrador");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            cargo = input.nextInt();

            switch (cargo) {
                case 1:
                    System.out.println("Cargo: Empregado");
                    break;
                case 2:
                    System.out.println("Cargo: Chefe");
                    break;
                case 3:
                    System.out.println("Cargo: Administrador");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (cargo != 1 && cargo != 2 && cargo != 3 && cargo != 4);

        if (cargo == 4) {
            System.out.println("Programa encerrado.");
        } else {
            System.out.println("=== Nº de dias trabalhados ===");
            System.out.print("Quantos dias trabalhou? : ");
            dia = input.nextInt();

            if (cargo == 1) {
                salario = 40;
            } else if (cargo == 2) {
                salario = 60;
            } else if (cargo == 3) {
                salario = 80;
            }

            if (dia > 20) {
                bonus = 1.05;
            } else if (dia > 17 && dia <= 20) {
                bonus = 1.02;
            } else if (dia <= 17) {
                bonus = 1;
            }

            if (cargo == 1) {
                subsidio = 5 * dia;
            } else if (cargo == 2) {
                subsidio = 7.5 * dia;
            } else if (cargo == 3) {
                subsidio = 7.5 * dia;
            }

            System.out.println("O seu subsídio de alimentação é de: " + subsidio);

            vencimento = (salario * dia * bonus) + subsidio;
            System.out.println("O seu vencimento ilíquido é: " + vencimento);

            if (vencimento < 1000) {
                irs = vencimento * 0.10;
            } else if (vencimento >= 1000 && vencimento < 2500) {
                irs = vencimento * 0.20;
            } else {
                irs = vencimento * 0.30;
            }

            System.out.println("O valor do IRS a ser deduzido é: " + irs);
            double vencimentoLiquido = vencimento - irs;
            System.out.println("O seu vencimento líquido é: " + vencimentoLiquido);

            if (cargo == 3) {
                ssFuncionario = vencimento * 0.09;
                ssEmpresa = vencimento * 0.21;
            } else {
                ssFuncionario = vencimento * 0.11;
                ssEmpresa = vencimento * 0.2375;
            }

            System.out.println("O valor da Segurança Social a ser deduzido do funcionário é: " + ssFuncionario);
            System.out.println("O valor da Segurança Social a ser pago pela empresa é: " + ssEmpresa);

            vencimentoLiquido = vencimento - irs - ssFuncionario;
            System.out.println("O Vencimento líquido é: " + vencimentoLiquido);
        }
    }
}
