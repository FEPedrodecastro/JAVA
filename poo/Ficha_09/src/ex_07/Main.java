package ex_07;

public class Main {


    public static void main(String[] args) {
        Livro livro1 = new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle", "Mistério", 256, 978316148);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", "Fantasia", 320, 978061678);

        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();
    }
}





