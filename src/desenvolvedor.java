public class desenvolvedor extends funcionario {
    // Atributo específico
    private int quantidadeProjetos;

    // Construtor
    public desenvolvedor(String nome, double salarioBase, int quantidadeProjetos) {
        super(nome, salarioBase); // chama o construtor da classe Funcionario
        this.quantidadeProjetos = quantidadeProjetos;
    }

    // Getter e Setter
    public int getQuantidadeProjetos() {
        return quantidadeProjetos;
    }

    public void setQuantidadeProjetos(int quantidadeProjetos) {
        this.quantidadeProjetos = quantidadeProjetos;
    }

    // Implementação do método abstrato
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (quantidadeProjetos * 500);
    }
}
