package ex_05;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Seat", "Toledo", 2005);
        System.out.println("O carro " + car.getMarca()+" "+car.getModelo()+" de "+car.getAnoFabrico());
        car.ligar();
    }

}

