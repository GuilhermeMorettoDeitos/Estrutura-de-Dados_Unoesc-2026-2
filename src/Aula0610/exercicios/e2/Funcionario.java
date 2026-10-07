package Aula0610.exercicios.e2;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    String nome;
    String cargo;
    List<Funcionario> subordinados = new ArrayList<>();

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    // TODO: Implemente este método recursivo de busca
    public Funcionario buscarFuncionarioPorNome(String nomeBuscado) {
        // Caso base 1: É o próprio funcionário?
        if (this.nome.equalsIgnoreCase(nomeBuscado)) {
            return this;
        }

        // Caso recursivo: Busca nos subordinados
        for (Funcionario sub : subordinados) {
            // Chame o método recursivamente aqui...
            Funcionario encontrado = sub.buscarFuncionarioPorNome(nomeBuscado);
            if(encontrado != null){
                return encontrado;
            }
        }

        return null; // Não encontrado nesta ramificação
    }
}
