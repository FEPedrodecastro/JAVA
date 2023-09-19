package ex_01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro", 32, 1.93);
        Pessoa pessoa2 = new Pessoa("fulano", 50, 1.65);

        System.out.println("Detalhes ex_01.Pessoa 1:");
        System.out.println(pessoa1.getName());
        System.out.println(pessoa1.getAge());
        System.out.println(pessoa1.getHeight());

        System.out.println("\nDetalhes ex_01.Pessoa 2:");
        System.out.println(pessoa2.getName());
        System.out.println(pessoa2.getAge());
        System.out.println(pessoa2.getHeight());

    }
}