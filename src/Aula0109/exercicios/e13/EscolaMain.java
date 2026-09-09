package Aula0109.exercicios.e13;

public class EscolaMain {
    public static void main(String[] args) {

        EscolaService escolaService = new EscolaService();

        Turma t1 = new Turma("Estrutura de Dados - Noite");
        t1.adicionarAluno(new Aluno("Guilherme"));
        t1.adicionarAluno(new Aluno("Ana"));

        Turma t2 = new Turma("Programação OO");
        t2.adicionarAluno(new Aluno("Mateus"));

        escolaService.adicionarTurma(t1);
        escolaService.adicionarTurma(t2);

        escolaService.relatorioEscola();
    }
}