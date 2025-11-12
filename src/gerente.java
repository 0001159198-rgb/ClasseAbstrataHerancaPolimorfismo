public class gerente extends funcionario {
    // Atributo específico
    private double bonus;

    // Construtor
    public gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    // Getter e Setter
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Implementação do método abstrato
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}

