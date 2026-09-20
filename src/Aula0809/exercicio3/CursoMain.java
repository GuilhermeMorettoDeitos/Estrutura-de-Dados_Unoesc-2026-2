package Aula0809.exercicio3;

public class CursoMain {
    public static void main(String[] args) {
        CursoService curso = new CursoService();

        curso.inserirAluno(new Aluno(101, "Guilherme", 8.5));
        curso.inserirAluno(new Aluno(102, "Ana", 9.2));
        curso.inserirAluno(new Aluno(103, "Lucas", 6.4));

        curso.listarAlunos();
        curso.buscarAluno(102);

        curso.exibirMaiorMedia();
        curso.exibirMenorMedia();

        curso.removerAluno(101);
        curso.listarAlunos();
    }
}