// Classe abstrata Funcionario
public abstract class funcionario {
    // Atributos
    private String nome;
    private double salarioBase;

    // Construtor
    public funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Métodos concretos (getters e setters)
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

    // Método abstrato
    public abstract double calcularSalario();
}
