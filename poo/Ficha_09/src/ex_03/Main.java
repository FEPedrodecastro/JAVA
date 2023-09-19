package ex_03;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,12);

        double area = rectangle.getLargura() * rectangle.getAltura();
        double perimetro = 2 * (rectangle.getLargura() + rectangle.getAltura());

        // Exibindo os resultados
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
