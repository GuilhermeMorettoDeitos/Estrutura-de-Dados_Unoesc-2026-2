package Aula0109.exercicios.e14;

public class LojaMain {
    public static void main(String[] args) {

        CarrinhoService carrinho = new CarrinhoService();

        Produto p1 = new Produto("Camiseta", 49.90);
        Produto p2 = new Produto("Calça Jeans", 129.90);

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.calcularTotal();

        carrinho.removerProduto(p1);
        carrinho.calcularTotal();
    }
}