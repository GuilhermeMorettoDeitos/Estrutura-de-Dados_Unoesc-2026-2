package Aula0109.exercicios.e12;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
}