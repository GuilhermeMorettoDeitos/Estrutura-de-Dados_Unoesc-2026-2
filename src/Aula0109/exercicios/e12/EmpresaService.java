package Aula0109.exercicios.e12;

import java.util.ArrayList;
import java.util.List;

public class EmpresaService {

    private List<Departamento> departamentos = new ArrayList<>();

    public void adicionarDepartamento(Departamento dep) {
        departamentos.add(dep);
    }

    public void listarEmpresa() {
        System.out.println("=== ESTRUTURA DA EMPRESA ===");
        for (Departamento dep : departamentos) {
            System.out.println("Departamento: " + dep.getNome());
            for (Funcionario f : dep.getFuncionarios()) {
                System.out.println("  - Funcionário: " + f.getNome());
            }
        }
        System.out.println("============================\n");
    }
}