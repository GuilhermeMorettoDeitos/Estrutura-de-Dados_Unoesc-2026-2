package Aula1808;

import java.util.ArrayList;
import java.util.List;

public class ListaExercicio4 {

    public static void main(String[] args){

        List<String> tarefasDiarias = new ArrayList<>();
        tarefasDiarias.add("Limpar a casa");
        tarefasDiarias.add("Verificar caixa do email");
        tarefasDiarias.add("Fazer commit das atividades");

        System.out.println("Tamanho da lista: " + tarefasDiarias.size());

        tarefasDiarias.remove(1);
        tarefasDiarias.add(1, "Jantar social");

        for(String tarefa : tarefasDiarias){
            System.out.println(">> " + tarefa);
        }


    }

}
