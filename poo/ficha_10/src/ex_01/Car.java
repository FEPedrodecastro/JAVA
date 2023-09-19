package ex_01;

public class Car {

    private String marca,modelo;

    private int anoFabrico,potencia,cilindrada,litros100Km;

    private TipoCombustivel combustivel;

    /**
     * Metodo Construtor de um carro
     * @param marca - marca do carro
     * @param modelo - modelo do carro
     * @param anoFabrico - ano de fabrico do carro
     * @param potencia - potencia do carro
     * @param cilindrada - cilindrada do carro
     * @param litros100Km - nº de litros gastos aos 100km
     */
    public Car(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, int litros100Km, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.litros100Km = litros100Km;
        this.combustivel = combustivel;
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
        //avaliar a idade do carro
        if(this.anoFabrico>=1993){
            //avaliar potencia
            if(this.potencia>=250){
                System.out.println("está ligado! VRUUUMMMMMM!!!");
            }else{
                System.out.println("está ligado! Vruuummm!!!");
            }
        }else{
            if(this.combustivel.equals(TipoCombustivel.DIESEL)){
                //carro a diesel
                System.out.println("Deita um pouco de fumo...");
                System.out.println("Custa a pegar...");
                System.out.println("O carro esta ligado!");
                System.out.println("Vrum - Vrum - Vrum!");
            }else{
                //outro combustivel
                System.out.println("Custa a pegar...");
                System.out.println("O carro está ligado!");
                System.out.println("Vrum - Vrum - Vrum!");
            }
        }
    }

    /**
     * Metodo para realizar corrida analisando potencia,cilindrada e ano de fabrico
     * @param adversario - carro adversario
     * @return
     */

    public Car corrida (Car adversario){
        if(this.potencia>adversario.potencia){
            //ganha o primeiro carro
            return this;
        }else {
            if(adversario.potencia>this.potencia){
                //Ganha carro adversario
                return adversario;
            }else{
                //empate por potencia
            }if(this.cilindrada>adversario.cilindrada){
                //ganha o primeiro carro
                return this;
            }else {
                if (adversario.cilindrada>this.cilindrada){
                    //Ganha carro adversario
                    return adversario;
                }else{
                    //Empate por cilindrada
                    if(this.anoFabrico>adversario.anoFabrico){
                        //ganha o primeiro carro
                        return this;
                    }else{
                        if(adversario.anoFabrico>this.anoFabrico){
                            //ganha adversario
                            return adversario;
                        }else{
                            //empate
                            return null;
                        }
                    }
                }
            }
        }
    }
    public void exibirDetalhes(){
        //Exibir detalhes do carro vencedor
        System.out.println("Marca:" + this.marca);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ano:" + this.anoFabrico);
        System.out.println("Potência:" + this.potencia);
        System.out.println("Cilindrada:" + this.cilindrada);
        System.out.println("Combustível:" + this.combustivel);
        System.out.println("L/100Km:" + this.litros100Km);
    }

    public double calcularConsumo(double distanciaKm) {
        // Calcula o consumo de combustível
        double consumo = (distanciaKm / 100) * this.litros100Km;
        return consumo;
    }


}
