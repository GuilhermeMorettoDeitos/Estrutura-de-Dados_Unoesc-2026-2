package Aula2710.Exercicios.CollectionsSort.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Livro implements Comparable<Livro> {
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    // Implementação corrigida para ordenar pela quantidade de páginas
    @Override
    public int compareTo(Livro outroLivro) {
        return Integer.compare(this.paginas, outroLivro.paginas);
    }

    @Override
    public String toString() {
        return titulo + " (" + paginas + " páginas)";
    }
}

public class Exerxcicio4 {
    public static void main(String[] args) {
        List<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(new Livro("Estrutura de Dados", 450));
        listaDeLivros.add(new Livro("Orientação objetos Java", 120));
        listaDeLivros.add(new Livro("Arquitetura de Software", 300));

        // Agora o método compila com sucesso
        Collections.sort(listaDeLivros);

        System.out.println("Livros ordenados por número de páginas:");
        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }
    }
}
