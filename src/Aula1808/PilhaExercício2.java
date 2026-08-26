package Aula1808;

import java.util.Stack;

public class PilhaExercício2 {

    public static void main(String[] args) {
        String palavra = "JAVA";

        Stack<Character> pilha = new Stack<>();

        // Coloca cada caractere na pilha
        for (char c : palavra.toCharArray()) {
            pilha.push(c);
        }

        // Retira os caracteres da pilha
        String invertida = "";
        while (!pilha.isEmpty()) {
            invertida += pilha.pop();
        }

        System.out.println("Palavra Invertida: " + invertida);
    }

}
