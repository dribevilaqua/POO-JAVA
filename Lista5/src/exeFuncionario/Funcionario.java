package exeFuncionario;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário: R$ " + calcularSalario());
        System.out.println("\n");
    }
}
