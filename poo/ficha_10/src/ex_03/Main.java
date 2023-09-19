package ex_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando uma instância de Animal
        List<String> alimentos = new ArrayList<>();
        alimentos.add("carne");
        alimentos.add("peixe");
        alimentos.add("frutas");

        Animal animal = new Animal("Leão", "Felino", "África", "carne", 60.8);

        // Alimentando o animal com um alimento que ele gosta
        animal.animalComer("carne", 500);
        System.out.println("Novo peso do " + animal.getNome() + ": " + animal.getPesoKg() + " kg");

        // Alimentando o animal com um alimento que ele não gosta
        animal.animalComer("vegetais", 300);
        System.out.println("Novo peso do " + animal.getNome() + ": " + animal.getPesoKg() + " kg");
    }
}
