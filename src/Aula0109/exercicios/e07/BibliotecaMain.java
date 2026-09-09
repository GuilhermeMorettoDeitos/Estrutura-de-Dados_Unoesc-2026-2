package Aula0109.exercicios.e07;

public class BibliotecaMain {
    public static void main(String[] args) {

        BibliotecaService bibliotecaService = new BibliotecaService();

        // Adicionando livros
        Livro livro1 = new Livro("Odisseia", "Machado de Assis");
        Livro livro2 = new Livro("Hobbit", "teste");

        bibliotecaService.adicionarLivro(livro1);
        bibliotecaService.adicionarLivro(livro2);

        // Realizando buscas
        bibliotecaService.buscarPorTitulo("Odisseia");
        bibliotecaService.buscarPorTitulo("1984");
    }
}