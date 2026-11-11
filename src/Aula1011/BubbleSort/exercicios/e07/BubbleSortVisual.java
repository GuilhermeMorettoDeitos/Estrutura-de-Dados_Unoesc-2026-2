package Aula1011.BubbleSort.exercicios.e07;

import java.util.Arrays;

public class BubbleSortVisual {

    public static void bubbleSortRastreamento(int[] vetor) {
        int n = vetor.length;
        int aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Armazena quem está sendo trocado para exibir
                    int valor1 = vetor[j];
                    int valor2 = vetor[j + 1];

                    // Troca
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                    // Imprime o estado do array a cada troca bem-sucedida
                    System.out.println("Troca: " + valor1 + " <=> " + valor2 + " -> " + Arrays.toString(vetor));
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 6};

        System.out.println("Estado inicial: " + Arrays.toString(numeros) + "\n");

        bubbleSortRastreamento(numeros);

        System.out.println("\nEstado final ordenado: " + Arrays.toString(numeros));
    }
}