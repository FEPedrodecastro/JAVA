package ex_02;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Instanciar Contas
        Conta conta1 = new Conta("12345", "Vitor");
        Conta conta2 = new Conta("67890", "Primo da Suiça");

        conta1.verDetalhes();

        double valor;
        System.out.print("Insira o valor a depositar: ");
        valor = input.nextDouble();

        // Depositar
        conta1.depositar(valor);

        conta1.verDetalhes();

        // Levantar Dinheiro a Mais
        conta1.levantar(750);

        conta1.verDetalhes();

        // Levantar Dinheiro Válido
        conta1.levantar(40);

        conta1.verDetalhes();

        // Pedir Empréstimo Válido
        boolean emprestimoAprovado = conta1.pedirEmprestimo(300);
        if (emprestimoAprovado) {
            conta1.verDetalhes();
        }

        // Pedir Empréstimo Inválido (já existe uma dívida pendente)
        boolean segundoEmprestimo = conta1.pedirEmprestimo(200);
        if (!segundoEmprestimo) {
            conta1.verDetalhes();
        }

        // Transferir Inválido
        conta1.transferir(conta2, 10000);

        conta1.verDetalhes();
        conta2.verDetalhes();

        // Transferir Válido
        conta1.transferir(conta2, 110);

        conta1.verDetalhes();
        conta2.verDetalhes();
    }
}

