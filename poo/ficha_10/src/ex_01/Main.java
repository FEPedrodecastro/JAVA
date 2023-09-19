package ex_01;

public class Main {
    public static void main(String[] args) {

        Car seat = new Car("Seat","Toledo",2005,140,1900,6,TipoCombustivel.DIESEL);
        Car mercedes = new Car ("Mercedes", "CLA", 2020,253,3000,8,TipoCombustivel.GASOLINA);
        Car fiat = new Car ("Fiat","Punto",1991,100,1200,7,TipoCombustivel.GPL );

        System.out.println("LIGAR CARROS!!!");
        System.out.println("\nO carro " + seat.getMarca() + " " + seat.getModelo() + " de " + seat.getAnoFabrico());
        seat.ligar();
        System.out.println("\nO carro " + mercedes.getMarca() + " " + mercedes.getModelo() + " de " + mercedes.getAnoFabrico());
        mercedes.ligar();
        System.out.println("\nO carro " + fiat.getMarca() + " " + fiat.getModelo() + " de " + fiat.getAnoFabrico());
        fiat.ligar();

        System.out.println("\nCorridas");
        System.out.println("\nCorrida 1 - SEAT contra FIAT - Resultado:");
        Car vencedor1 = seat.corrida(fiat);
        vencedor1.exibirDetalhes();

        System.out.println("\nCorrida 2 - Vencedor Corrida 1 contra Mercedes - Resultado:");
        Car vencedor2 = vencedor1.corrida(mercedes);
        vencedor2.exibirDetalhes();


        // Cálculo de consumo de combustível do Seat com uma distância de 200 km
        double distancia = 200.0; // Distância em km
        double consumoSeat = seat.calcularConsumo(distancia);
        System.out.println("\nO consumo de combustível do " + seat.getMarca() + " " + seat.getModelo() + " numa distância de " + distancia + " km: " + consumoSeat + " litros.");


        System.out.println("Corrida entre " + seat.getMarca() + " e " + mercedes.getMarca());
        Car vencedorCorrida = seat.corrida(mercedes);

        if (vencedorCorrida != null) {
            System.out.println("O vencedor da corrida é o carro " + vencedorCorrida.getMarca() + " " + vencedorCorrida.getModelo());
        } else {
            System.out.println("A corrida terminou em empate.");
        }

        double distanciaViagemKm = 97.0;
        double consumoSeat2 = seat.calcularConsumo(distancia);
        double consumoMercedes2 = mercedes.calcularConsumo(distancia);

        System.out.println("\nConsumo de combustível em uma viagem de " + distanciaViagemKm + " km:");
        System.out.println(seat.getMarca() + " " + seat.getModelo() + ": " + consumoSeat + " litros");
        System.out.println(mercedes.getMarca() + " " + mercedes.getModelo() + ": " + consumoMercedes2 + " litros");

        if (consumoSeat > consumoMercedes2) {
            System.out.println(seat.getMarca() + " " + seat.getModelo() + " gastaria mais em uma viagem de " + distanciaViagemKm + " km.");
        } else if (consumoMercedes2 > consumoSeat) {
            System.out.println(mercedes.getMarca() + " " + mercedes.getModelo() + " gastaria mais em uma viagem de " + distanciaViagemKm + " km.");
        } else {
            System.out.println("Ambos os carros gastariam a mesma quantidade em uma viagem de " + distanciaViagemKm + " km.");
        }

    }
}
