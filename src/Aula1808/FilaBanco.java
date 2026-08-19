package Aula1808;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {

    public static void main(String[] args){

        Queue<String> filaAtendimento = new LinkedList<>();
        filaAtendimento.add("Carlos (Senha 01)");
        filaAtendimento.add("Alex (Senha 02)");
        filaAtendimento.add("Ana (Senha 03)");

        System.out.println("Primeiro item da lista: " + filaAtendimento.peek());

        System.out.println();

        //remoção do primeiro item da lista
        filaAtendimento.remove();

        while (!filaAtendimento.isEmpty()){
            String clienteASerAtendido = filaAtendimento.poll();
            System.out.println(">> " + clienteASerAtendido);
        }



    }

}
