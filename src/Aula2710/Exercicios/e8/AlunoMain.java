package Aula2710.Exercicios.e8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlunoMain {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Bruno", 6.0));
        alunos.add(new Aluno("Carlos", 9.2));
        alunos.add(new Aluno("Diana", 7.8));

        Collections.sort(alunos, new Comparator<Aluno>() {
            public int compare(Aluno a1, Aluno a2) {
                return Double.compare(a1.getNota(), a2.getNota());
            }
        });

        System.out.println(alunos);
    }
}
