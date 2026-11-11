package Aula1011.BubbleSort.exercicios.e06;

import java.util.Arrays;

public class BubbleSortObjetos {

    public static class Produto {
        String nome;
        double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return nome + " (R$ " + preco + ")";
        }
    }

    public static void bubbleSortProduto(Produto[] vetor) {
        int n = vetor.length;
        Produto aux; // Auxiliar agora é do tipo Produto

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara o atributo preço de cada objeto
                if (vetor[j].preco > vetor[j + 1].preco) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("Notebook", 3500.00),
                new Produto("Mouse", 35.00),
                new Produto("Teclado", 150.00),
                new Produto("Monitor", 800.00),
                new Produto("Headset", 200.00)
        };

        System.out.println("Produtos antes:");
        System.out.println(Arrays.toString(produtos));

        bubbleSortProduto(produtos);

        System.out.println("\nProdutos ordenados por preço:");
        System.out.println(Arrays.toString(produtos));
    }
}