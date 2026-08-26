package Aula1808;

import java.util.Stack;

public class PilhaExercicio4 {

    static Stack<String> paginas = new Stack<>();

    public static void visitarPagina(String url){
        paginas.push(url);
    }

    public static void voltar(){
        System.out.println("Pagina removida: " + paginas.pop());
        System.out.println("Pagina atual: " + paginas.peek());
    }

    public static void main(String[] args){
        visitarPagina("Google.com");
        visitarPagina("amazon.com");
        visitarPagina("github.com");

        voltar();
        voltar();

    }

}
