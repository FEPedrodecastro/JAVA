package ex_10;

public class Main {

    public static void main(String[] args) {
        // Criar um objeto da classe Funcionario
        Funcionario funcionario = new Funcionario("Pedro", "Enfermagem", 1950.66);
        Funcionario funcionario2 = new Funcionario("Maria","Medicina", 1500);

        // Aumentar o salário em 20%
        funcionario.aumentarSalario(10);

        // Exibir os dados do funcionário
        funcionario.exibirDados();
        funcionario2.exibirDados();

        System.out.println("\nO que ganha mais:");

        if(funcionario.getSalario()>funcionario2.getSalario()){
            funcionario.exibirDados();
        }else{
            funcionario2.exibirDados();
        }
    }
}

