package Aula0109.exercicios.e13;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeTurma;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}