package ex_09;

public class Produto {

    private String nome;

    private double preco;

    private int stock = 0;

    public Produto(String nome, double preco, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.stock = 0;
    }

    public void comprar(int quantidade) {
        if (quantidade > 0) {
            stock += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram compradas.");
        } else {
            System.out.println("A quantidade a comprar deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= stock) {
            stock -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram vendidas.");
        } else if (quantidade > stock) {
            System.out.println("Transação não é possível devido a quebra de stock do produto.");
        } else {
            System.out.println("A quantidade a vender deve ser maior que zero.");
        }
    }

    public int getstock() {
        return stock;
    }
}