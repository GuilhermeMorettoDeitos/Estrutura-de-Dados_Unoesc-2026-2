package Aula1808;

import java.util.ArrayList;
import java.util.List;

public class ListaExercicio1e2 {

    public static void main(String[] args){
        //exercicio 1.
        List<String> nomesConvidados = new ArrayList<>();
        nomesConvidados.add("Ana");
        nomesConvidados.add("João");
        nomesConvidados.add("Fulano");
        nomesConvidados.add("Ciclano");

        for(String nomes : nomesConvidados){
            System.out.println(">> " + nomes);
        }

        //exercicio 2
        System.out.println("\nNome do Primeiro Convidado: " + nomesConvidados.get(0));
        System.out.println("Nome do Ultimo Convidado: " + nomesConvidados.get(3));
        //System.out.println("Acessando indice que não existe: " + nomesConvidados.get(4));


    }

}
