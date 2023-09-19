package ex_04;

public class Imovel {

    private String rua;
    private int nmrPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double area, numQuartos, numWc, areaPiscina;

    public Imovel(String rua, int nmrPorta, String cidade, Tipo tipo, Acabamento acabamento, double area, double numQuartos, double numWc, double areaPiscina) {
        this.rua = rua;
        this.nmrPorta = nmrPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numWc = numWc;
        this.areaPiscina = areaPiscina;
    }

    public String getRua() {
        return rua;
    }

    public int getNmrPorta() {
        return nmrPorta;
    }

    public String getCidade() {
        return cidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Acabamento getAcabamento() {
        return acabamento;
    }

    public double getArea() {
        return area;
    }

    public double getNumQuartos() {
        return numQuartos;
    }

    public double getNumWc() {
        return numWc;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public double calcularValor() {
        double valorPorMetroQuadrado = 0;

        // valor por metro quadrado com base no tipo de imóvel
        switch (tipo) {
            case APARTAMENTO:
                valorPorMetroQuadrado = 1000;
                break;
            case CASA:
                valorPorMetroQuadrado = 3000;
                break;
            case MANSAO:
                valorPorMetroQuadrado = 5000;
                break;
        }

        // aplica preço com desconto com base no acabamento
        switch (acabamento) {
            case RESTAURO:
                valorPorMetroQuadrado *= 0.5; // Desconto de 50%
                break;
            case USADA:
                valorPorMetroQuadrado *= 0.9; // Desconto de 10%
                break;
            case NOVA_COM_ALTO_ACABAMENTO:
                valorPorMetroQuadrado *= 1.25; // Valorização de 25%
                break;
        }

        // Calcular o valor do imóvel
        double valorImovel = area * valorPorMetroQuadrado;

        // valor dos quartos e casas de banho
        valorImovel += numQuartos * 7500;
        valorImovel += numWc * 10500;

        // custo da piscina
        valorImovel += areaPiscina * 1000;

        return valorImovel;

    }

    //imprimir detalhes do imovel
    public void exibirImovel () {
        System.out.println("O Imóvel da " + getRua() + "," + getNmrPorta() + " no(a) " + getCidade());
        System.out.println("Tipo: " + getTipo() + "\tAcabamento: " + getAcabamento());
        System.out.println("Com uma Área de: " + getArea() + "m2, com " + getNumQuartos() + " quartos e " + getNumWc() + " casas de banho e uma piscina de " + getAreaPiscina() + "m2.");
    }
}
