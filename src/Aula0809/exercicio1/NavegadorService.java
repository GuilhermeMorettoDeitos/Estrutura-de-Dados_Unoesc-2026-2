package Aula0809.exercicio1;

import java.util.Stack;

public class NavegadorService {

    private Stack<Pagina> historicoVoltar = new Stack<>();
    private Stack<Pagina> historicoAvancar = new Stack<>();
    private Pagina paginaAtual;

    public void acessarPagina(Pagina pagina) {
        if (paginaAtual != null) {
            historicoVoltar.push(paginaAtual);
        }
        paginaAtual = pagina;
        historicoAvancar.clear();
        System.out.println("Acessou: " + paginaAtual.getTitulo());
    }

    public void voltar() {
        if (!historicoVoltar.isEmpty()) {
            historicoAvancar.push(paginaAtual);
            paginaAtual = historicoVoltar.pop();
            System.out.println("Voltou para: " + paginaAtual.getTitulo());
        } else {
            System.out.println("Não há páginas no histórico para voltar.");
        }
    }

    public void avancar() {
        if (!historicoAvancar.isEmpty()) {
            historicoVoltar.push(paginaAtual);
            paginaAtual = historicoAvancar.pop();
            System.out.println("Avançou para: " + paginaAtual.getTitulo());
        } else {
            System.out.println("Não há páginas no histórico para avançar.");
        }
    }

    public void mostrarPaginaAtual() {
        if (paginaAtual != null) {
            System.out.println("Página Atual: " + paginaAtual.toString());
        } else {
            System.out.println("Nenhuma página aberta.");
        }
    }
}