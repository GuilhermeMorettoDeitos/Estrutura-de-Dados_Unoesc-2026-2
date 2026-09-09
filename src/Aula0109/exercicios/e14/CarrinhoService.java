package Aula0109.exercicios.e14;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoService {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.println("Produto '" + p.getNome() + "' adicionado ao carrinho.");
    }

    public void removerProduto(Produto p) {
        if (produtos.remove(p)) {
            System.out.println("Produto '" + p.getNome() + "' removido do carrinho.");
        } else {
            System.out.println("Produto '" + p.getNome() + "' não encontrado no carrinho.");
        }
    }

    public void calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        System.out.printf("Valor total do Carrinho: R$ %.2f\n\n", total);
    }
}