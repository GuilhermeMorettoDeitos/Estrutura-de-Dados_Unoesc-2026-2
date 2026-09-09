package Aula0109.exercicios.e10;

public class ItemPedido {

    private String produto;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(String produto, double precoUnitario, int quantidade) {
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return precoUnitario * quantidade;
    }
}