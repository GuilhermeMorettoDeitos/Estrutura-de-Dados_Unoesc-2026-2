package Aula0109.exercicios.e02;

public class EstoqueMain {
    public static void main(String[] args){

        EstoqueService estoqueService = new EstoqueService();

        Produto produto1 = new Produto("Maçã",5.20, 20);
        Produto produto2 = new Produto("Farinha",10.50, 90);

        estoqueService.adicionarProduto(produto1);
        estoqueService.adicionarProduto(produto2);

        estoqueService.listarEstoque();
    }
}
