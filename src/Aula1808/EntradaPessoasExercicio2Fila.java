package Aula1808;

import java.util.LinkedList;
import java.util.Queue;

public class EntradaPessoasExercicio2Fila {
    public static void main(String[] args){

        Queue<String> listaDeEspera = new LinkedList<>();
        listaDeEspera.add("Familia Silva");
        listaDeEspera.add("Casal Souza");

        System.out.println("Proximo da fila: " + listaDeEspera.peek());

        listaDeEspera.add("Grupo de amigos");

        System.out.println("Removendo a primeira pessoa que foi atendida: " + listaDeEspera.remove());

        System.out.println("Proximo da fila: " + listaDeEspera.peek());

        while (!listaDeEspera.isEmpty()){
            String pessoaASerAtendida = listaDeEspera.remove();
        }

    }
}
