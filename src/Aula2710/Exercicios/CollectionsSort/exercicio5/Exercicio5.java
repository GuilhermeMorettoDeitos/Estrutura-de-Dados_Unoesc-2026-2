package Aula2710.Exercicios.CollectionsSort.exercicio5;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", salario);
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Carlos", 4500.00));
        funcionarios.add(new Funcionario("Ana", 6200.00));
        funcionarios.add(new Funcionario("Bruno", 3100.00));
        funcionarios.add(new Funcionario("Daniela", 8000.00));

        // ordenação por nome (ordem alfabética) utilizando Lambda
        funcionarios.sort((f1, f2) -> f1.getNome().compareTo(f2.getNome()));

        System.out.println("Ordenado por Nome (Alfabético):");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        System.out.println("\n-----------------------------------\n");

        // Ordenação por salário (decrescente: do maior para o menor) utilizando Lambda
        // Note a inversão da ordem dos parâmetros no Double.compare para obter o efeito decrescente
        funcionarios.sort((f1, f2) -> Double.compare(f2.getSalario(), f1.getSalario()));

        System.out.println("Ordenado por Salário (Decrescente):");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
