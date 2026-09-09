package Aula0109.exercicios.e05;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void mediaVerificacao(Aluno aluno){
        double soma = 0;
        double media;

        double[] notas = aluno.getNotas();

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma/notas.length;

        System.out.printf("A média do/a aluno " + aluno.getNome() + " é: %.2f\n", media);
        System.out.print(" - Situação: ");
        if(media < 7){
            System.out.println("REPROVADO.\n");
        } else {
            System.out.println("APROVADO.\n");
        }
    }

}
