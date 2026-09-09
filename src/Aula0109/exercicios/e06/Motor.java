package Aula0109.exercicios.e06;

public class Motor {

    private String tipo;
    private int potencia;
    private boolean ligado;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.ligado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}