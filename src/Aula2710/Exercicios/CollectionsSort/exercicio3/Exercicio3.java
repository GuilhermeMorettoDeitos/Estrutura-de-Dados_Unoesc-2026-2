package Aula2710.Exercicios.CollectionsSort.exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // ordenação natural baseada no preço (crescente)
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return this.nome + " - R$ " + String.format("%.2f", this.preco);
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 45.50));
        produtos.add(new Produto("Monitor", 1200.00));
        produtos.add(new Produto("Teclado", 150.00));

        Collections.sort(produtos);

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
