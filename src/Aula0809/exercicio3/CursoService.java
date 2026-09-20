package Aula0809.exercicio3;

import java.util.LinkedList;

public class CursoService {

    private LinkedList<Aluno> alunos = new LinkedList<>();

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " inserido com sucesso.");
    }

    public void removerAluno(int matricula) {
        boolean removido = alunos.removeIf(a -> a.getMatricula() == matricula);
        if (removido) {
            System.out.println("Aluno com matrícula " + matricula + " removido.");
        } else {
            System.out.println("Matrícula " + matricula + " não encontrada.");
        }
    }

    public void buscarAluno(int matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                System.out.println("Aluno encontrado: " + a.getNome() + " | Média: " + a.getMedia());
                return;
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
    }

    public void listarAlunos() {
        System.out.println("\n=== Lista de Alunos ===");
        for (Aluno a : alunos) {
            System.out.println(a.getMatricula() + " - " + a.getNome() + " | Média: " + a.getMedia());
        }
        System.out.println("=======================\n");
    }

    public void exibirMaiorMedia() {
        if (alunos.isEmpty()) return;
        Aluno maior = alunos.getFirst();
        for (Aluno a : alunos) {
            if (a.getMedia() > maior.getMedia()) maior = a;
        }
        System.out.println("Maior Média: " + maior.getNome() + " (" + maior.getMedia() + ")");
    }

    public void exibirMenorMedia() {
        if (alunos.isEmpty()) return;
        Aluno menor = alunos.getFirst();
        for (Aluno a : alunos) {
            if (a.getMedia() < menor.getMedia()) menor = a;
        }
        System.out.println("Menor Média: " + menor.getNome() + " (" + menor.getMedia() + ")");
    }
}