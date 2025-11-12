public class desenvolvedor extends funcionario {
    
    private int quantidadeProjetos;

    
    public desenvolvedor(String nome, double salarioBase, int quantidadeProjetos) {
        super(nome, salarioBase); 
        this.quantidadeProjetos = quantidadeProjetos;
    }

    
    public int getQuantidadeProjetos() {
        return quantidadeProjetos;
    }

    public void setQuantidadeProjetos(int quantidadeProjetos) {
        this.quantidadeProjetos = quantidadeProjetos;
    }

    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (quantidadeProjetos * 500);
    }
}
