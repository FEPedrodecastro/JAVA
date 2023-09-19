package ex_03;

public class Animal {

    private String nome, especie, paisOrigem, alimentacao;

    private double pesoKg;

    public Animal(String nome, String especie, String paisOrigem, String alimentacao, double pesoKg) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.alimentacao = alimentacao;
        this.pesoKg = pesoKg;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void animalComer ( String alimento, double pesoG){

        if (alimentacao.contains(alimento)) {
            pesoKg += pesoG / 1000.0; // Converter gramas para kg
            System.out.println("O animal comeu.");
        } else {
            System.out.println("O animal recusou essa comida.");
        }
    }

}
