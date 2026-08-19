package Aula1808;

import java.util.Stack;

public class SistemaDigitacao {

    public static void main(String[] args){

        Stack<String> historicoAcoes = new Stack<>();
        historicoAcoes.push("Digitou: Olá");
        historicoAcoes.push("Digitou: Mundo!");
        historicoAcoes.push("Digitou: Negrito");

        //remove o ultimo elemento
        historicoAcoes.pop();

        System.out.println("Histórico atual: " + historicoAcoes);

        //mostra ultimo item da lista
        System.out.println(historicoAcoes.peek());

    }
}
