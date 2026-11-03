package Aula2710.Exercicios.CollectionsSort.exercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Aluno implements Comparable<Aluno> {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno outro) {
        // Critério primário: Nota em ordem decrescente (maior para a menor)
        int comparacaoNota = Double.compare(outro.nota, this.nota);

        // Se as notas forem diferentes, retorna o resultado dessa comparação
        if (comparacaoNota != 0) {
            return comparacaoNota;
        }

        // Critério de desempate: Idade em ordem crescente (mais novo para o mais velho)
        return Integer.compare(this.idade, outro.idade);
    }

    @Override
    public String toString() {
        return "Nota: " + nota + " | Idade: " + idade + " | Nome: " + nome;
    }
}

public class Exercicio6 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        // Populando a lista com casos de empate na nota para testar a lógica
        alunos.add(new Aluno("Marcos", 22, 8.5));
        alunos.add(new Aluno("Julia", 19, 9.0));
        alunos.add(new Aluno("Pedro", 25, 7.0));
        alunos.add(new Aluno("Fernanda", 20, 8.5)); // Empate de nota com Marcos
        alunos.add(new Aluno("Lucas", 24, 9.0));   // Empate de nota com Julia

        System.out.println("Lista antes da ordenação:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }

        Collections.sort(alunos);

        System.out.println("\nLista após ordenação (Nota decrescente, desempate por Idade crescente):");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }
}