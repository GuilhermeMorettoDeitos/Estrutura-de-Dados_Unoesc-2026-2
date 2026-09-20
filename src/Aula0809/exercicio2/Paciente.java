package Aula0809.exercicio2;

public class Paciente {

    private String nome;
    private int idade;
    private int urgencia;
    private int ordemChegada;

    public Paciente(String nome, int idade, int urgencia, int ordemChegada) {
        this.nome = nome;
        this.idade = idade;
        this.urgencia = urgencia;
        this.ordemChegada = ordemChegada;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getUrgencia() { return urgencia; }
    public int getOrdemChegada() { return ordemChegada; }
}