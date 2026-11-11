package Aula1011.BubbleSort.exercicios.e04;

import java.util.Arrays;

public class BubbleSortOtimizado {

    public static void bubbleSortOtimizado(int[] vetor) {
        int n = vetor.length;
        int aux;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            System.out.println("Passada executada (i = " + i + ")"); // Prova textual

            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocou = true;
                }
            }

            // Se nenhuma troca ocorreu na passada, interrompe o laço externo
            if (!trocou) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6}; // Array já ordenado

        System.out.println("Vetor: " + Arrays.toString(numeros));
        System.out.println("\nIniciando ordenação...");
        bubbleSortOtimizado(numeros);
        System.out.println("\nFim do algoritmo.");
    }
}