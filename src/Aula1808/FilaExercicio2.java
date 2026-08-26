package Aula1808;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExercicio2 {

    public static void main(String[] args){
        Queue<String> filaEspera = new LinkedList<>();

        filaEspera.add("Família Silva");
        filaEspera.add("Casal Souza");

        System.out.println("Proximo da fila: " + filaEspera.peek());

        filaEspera.add("Grupo de Amigos");

        System.out.println(" - Atendimento Realizado: " + filaEspera.remove());
        System.out.println("Mesa liberada");

        System.out.println("\nProximo da fila: " + filaEspera.peek());

        while(!filaEspera.isEmpty()){
            System.out.println("Cliente removido: " + filaEspera.remove());
        }


    }

}
