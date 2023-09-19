package ex_02;

public class Conta {

    private String numero_Conta;
    private double saldo=0;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo=saldo*0.9;
    private double valorDivida;

    /**
     * Método Construtor para uma Conta
     * @param numero_Conta - IBAN (Numero da Conta)
     * @param titular - Nome do Titular da Conta
     */
    public Conta(String numero_Conta, String titular) {
        this.numero_Conta = numero_Conta;
        this.titular = titular;
    }
    /**
     * Método para Depositar Dinheiro na Conta
     *
     * @param valor - Valor a Depositar
     */
    public void depositar(double valor) {
        this.saldo += valor;
        this.margemEmprestimo += valor; // Atualiza a margem de empréstimo quando é feito um depósito
        System.out.println("\nDepósito Efetuado");
    }

    /**
     * Método para Levantar Dinheiro da Conta
     *
     * @param valor - Valor a Levantar
     */
    public void levantar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.margemEmprestimo -= valor; // Atualiza a margem de empréstimo quando é feito um levantamento
            System.out.println("\nLevantamento Efetuado");
        } else {
            System.out.println("\nLevantamento Recusado! Saldo Insuficiente!");
        }
    }

    /**
     * Método para Transferir Dinheiro de uma Conta para Outra
     * @param contaDestino
     * @param valor
     */
    public void transferir(Conta contaDestino, double valor){

        if(this.saldo>= valor){
            // Caso a transferencia seja valida
            System.out.println("\nTransferencia Concluida!");
            this.saldo-=valor;
            contaDestino.depositar(valor);
        }else{
            // Transferencia invalida, saldo insuficiente
            System.out.println("\nTransferencia Recusada! Saldo Insuficiente");
        }
    }

    /**
     * Método para Pedir Empréstimo
     *
     * @param valor - Valor a Pedir em Empréstimo
     * @return true se o empréstimo for bem-sucedido, false caso contrário
     */
    public boolean pedirEmprestimo(double valor) {
        if (this.valorDivida == 0) { // Verifica se já há uma dívida pendente
            if (valor <= this.margemEmprestimo) { // Verifica se o valor do empréstimo é menor ou igual à margem
                this.saldo += valor;
                this.valorDivida += valor;
                this.margemEmprestimo -= valor; // Atualiza a margem de empréstimo
                System.out.println("\nEmpréstimo de " + valor + "€ concedido.");
                return true;
            } else {
                System.out.println("\nEmpréstimo Recusado! Valor excede a margem de empréstimo disponível.");
                return false;
            }
        } else {
            System.out.println("\nEmpréstimo Recusado! Já existe uma dívida pendente.");
            return false;
        }
    }

    /**
     * Método para Imprimir na Consola os Detalhes da Conta
     */
    public void verDetalhes() {
        System.out.println("\nNumero da Conta: " + this.numero_Conta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo Atual: " + this.saldo);
        System.out.println("Ano de Abertura: " + this.anoAbertura);
        System.out.println("Margem de Empréstimo: " + this.margemEmprestimo);
        System.out.println("Valor em Dívida: " + this.valorDivida);
    }
}
