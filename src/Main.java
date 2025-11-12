import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando uma lista de Funcionarios (polimórfica)
        List<funcionario> funcionarios = new ArrayList<>();

        // Adicionando diferentes tipos de funcionários
        funcionarios.add(new desenvolvedor("Ana", 3000, 3));  // 3000 + (3 * 500)
        funcionarios.add(new desenvolvedor("Bruno", 2800, 5)); // 2800 + (5 * 500)
        funcionarios.add(new gerente("Carla", 5000, 1500));   // 5000 + 1500
        funcionarios.add(new gerente("Diego", 6000, 2000));   // 6000 + 2000

        // Exibindo nome e salário de cada funcionário
        System.out.println("=== Folha de Pagamento ===");
        for (funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário final: R$ " + f.calcularSalario());
            System.out.println("--------------------------");
        }
    }
}
