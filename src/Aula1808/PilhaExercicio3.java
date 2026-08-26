package Aula1808;

import java.util.Stack;

public class PilhaExercicio3 {

    public static boolean balanceado(String expressao){

        Stack<Character> pilhaVerificacao = new Stack<>();

        for(char c : expressao.toCharArray()){
            if (c == '('){
                pilhaVerificacao.push(c);

            } else if (c == ')') {
                if (!pilhaVerificacao.isEmpty()){
                    pilhaVerificacao.pop();
                }
            }
        }

        if (pilhaVerificacao.isEmpty()){
            System.out.println("A expressão está balanceada.");
        } else {
            System.out.println("A expressão está desbalanceada.");
        }

        return false;
    }

    public static void main(String[] args){

        System.out.println(balanceado("(A - B)) * (C - D)"));

    }

}
