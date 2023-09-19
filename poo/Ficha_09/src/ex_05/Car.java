package ex_05;

public class Car {

    private String marca;

    private String modelo;

    private int anoFabrico;

    public Car(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public void ligar() {
        System.out.println("está ligado!");
    }
}
