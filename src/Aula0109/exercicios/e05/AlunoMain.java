package Aula0109.exercicios.e05;

public class AlunoMain {
    public static void main(String[] args){

        AlunoService alunoService = new AlunoService();

        //forma 1: declarando e preenchendo o valor diretamente.
        double[] notasDOGuilherme = {8.5, 6.5, 7};
        Aluno aluno = new Aluno("Guilherme", notasDOGuilherme);
        alunoService.adicionarAluno(aluno);

        //forma 2: instanciando e definindo valores por posição.
        double[] notasDaAna = new double[3];
        notasDaAna[0] = 3;
        notasDaAna[1] = 9;
        notasDaAna[2] = 4;

        Aluno aluno1 = new Aluno("Ana", notasDaAna);
        alunoService.adicionarAluno(aluno1);

        alunoService.mediaVerificacao(aluno);
        alunoService.mediaVerificacao(aluno1);

    }
}
