package ex_08;

public class Main {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 20, "Enfermagem", 19.8);
        Aluno aluno2 = new Aluno("Maria", 22, "Medicina", 8.2);

        System.out.println("Aluno João: " + aluno1.situacao());
        System.out.println("Aluna Maria: " + aluno2.situacao());
    }
}

