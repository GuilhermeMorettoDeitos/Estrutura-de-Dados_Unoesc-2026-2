package Aula0109.exercicios.e09;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamentoService {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularTotalSalarios() {
        double total = 0;
        for (Funcionario func : funcionarios) {
            total += func.getSalario();
        }

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        System.out.println("Total de Funcionários: " + funcionarios.size());
        System.out.printf("Valor total de salários: R$ %.2f\n", total);
        System.out.println("==========================\n");
    }
}