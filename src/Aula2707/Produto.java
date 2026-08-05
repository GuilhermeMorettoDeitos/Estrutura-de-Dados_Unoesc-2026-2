package Aula2707;

public class Produto {

    private int id;
    private String nome;
    private String codigoBarras;
    private double preco;

    public Produto(int id, String nome, String codigoBarras, double preco){
        this.id = id;
        this.nome =nome;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
    }

    public String toString(){
        return "Produto: " + nome + " - " + codigoBarras;
    }
}
