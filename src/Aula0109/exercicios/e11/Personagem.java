package Aula0109.exercicios.e11;

public class Personagem {

    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(vida, 0); // Evita vida negativa
    }

    public int getForca() {
        return forca;
    }
}