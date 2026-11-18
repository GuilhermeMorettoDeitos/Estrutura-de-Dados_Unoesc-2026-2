package Aula1711;

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}

public class Exercicio5 {

    public static <T extends Comparable<T>> void quickSort(T[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);

            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private static <T extends Comparable<T>> int particionar(T[] arr, int baixo, int alto) {
        T pivo = arr[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            // Ordena do mais barato para o mais caro usando compareTo
            if (arr[j].compareTo(pivo) <= 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("Monitor", 1200.00),
                new Produto("Mouse", 45.90),
                new Produto("Notebook", 3500.00),
                new Produto("Teclado", 150.00)
        };

        System.out.println("Produtos antes da ordenação:");
        imprimirArray(produtos);

        quickSort(produtos, 0, produtos.length - 1);

        System.out.println("\nProdutos ordenados por preço:");
        imprimirArray(produtos);
    }

    private static <T> void imprimirArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}