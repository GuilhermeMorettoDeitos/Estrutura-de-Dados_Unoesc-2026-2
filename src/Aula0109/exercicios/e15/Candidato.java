package Aula0109.exercicios.e15;

public class Candidato {

    private String nome;
    private int votos;

    public Candidato(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementarVoto() {
        this.votos++;
    }
}