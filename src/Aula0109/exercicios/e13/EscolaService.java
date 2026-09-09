package Aula0109.exercicios.e13;

import java.util.ArrayList;
import java.util.List;

public class EscolaService {

    private List<Turma> turmas = new ArrayList<>();

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void relatorioEscola() {
        System.out.println("=== RELATÓRIO DA ESCOLA ===");
        for (Turma t : turmas) {
            System.out.println("Turma: " + t.getNomeTurma());
            for (Aluno a : t.getAlunos()) {
                System.out.println("  * Aluno: " + a.getNome());
            }
        }
        System.out.println("===========================\n");
    }
}