package ex_09;

public class Main {


    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 20.0);

        produto.comprar(5);
        produto.vender(2);

        System.out.println("Quantidade em stock: " + produto.getstock());

        produto.comprar(10);
        produto.vender(35);
    }
}
