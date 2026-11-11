package Aula1011.BubbleSort.exercicios.e03;

import java.util.Arrays;

public class BubbleSortTamanhoString {

    public static void bubbleSort(String[] vetor) {
        int n = vetor.length;
        String aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara o tamanho (length) das palavras
                if (vetor[j].length() > vetor[j + 1].length()) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] frutas = {"Melancia", "Uva", "Morango", "Abacaxi", "Kiwi"};

        System.out.println("Vetor original: " + Arrays.toString(frutas));
        bubbleSort(frutas);
        System.out.println("Vetor ordenado por tamanho: " + Arrays.toString(frutas));
    }
}