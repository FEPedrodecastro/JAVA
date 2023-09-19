package ex_07;

public class Livro {

    private String titulo,autor,categoria;

    private int nrPaginas,isbn;

    public Livro(String titulo, String autor, String categoria, int nrPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.nrPaginas = nrPaginas;
        this.isbn = isbn;

    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Número de Páginas: " + nrPaginas);
        System.out.println("ISBN: " + isbn);
    }
}
