package Aula1808;

import java.util.Stack;

public class pilhaExercicio1 {

    public static void main(String[] args){

        Stack<Integer> pilhaNumeros = new Stack<>();

        pilhaNumeros.push(10);
        pilhaNumeros.push(20);
        pilhaNumeros.push(30);

        System.out.println(" - Elemento do topo: " + pilhaNumeros.peek());
        while (!pilhaNumeros.isEmpty()){
            System.out.println(" - Elemento Removido: " + pilhaNumeros.pop());
        }

    }

}
