package ex_04;

public class Main {

    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua A", 123, "Cidade X", Tipo.CASA, Acabamento.NOVA_COM_ALTO_ACABAMENTO, 150, 3, 2, 50);
        double valor = imovel.calcularValor();
        imovel.exibirImovel();
        System.out.println("Valor do imóvel: " + valor + "€");
    }
}
