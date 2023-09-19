package ex_02;

public class main {

    public static void main(String[] args) {

            Cao cao1 = new Cao("fido", "labrador");
            Cao cao2 = new Cao("spot","german pastor");
            Cao cao3 = new Cao ("james", "chowchow");

            cao1.setBarkSound("ruff ruff");


            System.out.println("Cão 1: " + cao1.getName() + " (" + cao1.getRace() +")" + cao1.getBarkSound());

            System.out.println("Cão 2: " + cao2.getName() + " (" + cao2.getRace()  +")" + cao2.getBarkSound());

            System.out.println("Cão 3: " + cao3.getName() + " (" + cao3.getRace()  +")" + cao3.getBarkSound());

        }
    }
