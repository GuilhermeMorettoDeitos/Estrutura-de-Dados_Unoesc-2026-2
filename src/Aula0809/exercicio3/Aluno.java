package Aula0809.exercicio3;

public class Aluno {

    private int matricula;
    private String nome;
    private double media;

    public Aluno(int matricula, String nome, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public double getMedia() { return media; }
}