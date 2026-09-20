package Aula0809.exercicio1;

public class NavegadorMain {
    public static void main(String[] args) {
        NavegadorService navegador = new NavegadorService();

        navegador.acessarPagina(new Pagina("www.google.com", "Google"));
        navegador.acessarPagina(new Pagina("www.unoesc.edu.br", "Unoesc"));
        navegador.acessarPagina(new Pagina("www.github.com", "GitHub"));

        navegador.mostrarPaginaAtual();
        navegador.voltar();
        navegador.mostrarPaginaAtual();
        navegador.voltar();
        navegador.avancar();
    }
}