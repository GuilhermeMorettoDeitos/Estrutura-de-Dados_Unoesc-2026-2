package Aula0109.exercicios.e07;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado com sucesso!");
    }

    public void buscarPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("\n--- Livro Encontrado ---");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor() + "\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nLivro com o título '" + titulo + "' não foi encontrado.\n");
        }
    }
}