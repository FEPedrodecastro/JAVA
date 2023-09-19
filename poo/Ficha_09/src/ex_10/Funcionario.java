package ex_10;

public class Funcionario {

    private String nome,departamento;
    private double salario;

    /**
     * Método Construtor para obter
     * @param nome - nome do funcionario
     * @param departamento - departamento em que trabalha
     * @param salario - salario sem aumento
     */
    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // Método para aumentar o salário em um percentual
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = salario * (percentual / 100);
            salario += aumento;
        } else {
            System.out.println("O percentual de aumento deve ser maior que zero.");
        }
    }

    // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario + "€");
        System.out.println("Departamento: " + departamento);
    }}
