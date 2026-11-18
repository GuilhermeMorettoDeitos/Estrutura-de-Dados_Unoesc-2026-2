package Aula1711;

import java.util.Arrays;

public class Exercicio3 {

    public static void quickSort(String[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);

            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private static int particionar(String[] arr, int baixo, int alto) {
        String pivo = arr[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (arr[j].compareToIgnoreCase(pivo) <= 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        String[] frutas = {"Uva", "banana", "Abacaxi", "Laranja", "morango", "Kiwi"};

        System.out.println("Original: " + Arrays.toString(frutas));

        quickSort(frutas, 0, frutas.length - 1);

        System.out.println("Ordenado: " + Arrays.toString(frutas));
    }
}