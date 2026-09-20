package Aula0809.exercicio4;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    private Produto esquerda;
    private Produto direita;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public Produto getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(Produto esquerda) { this.esquerda = esquerda; }

    public Produto getDireita() { return direita; }
    public void setDireita(Produto direita) { this.direita = direita; }
}