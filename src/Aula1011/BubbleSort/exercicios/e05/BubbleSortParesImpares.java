package Aula1011.BubbleSort.exercicios.e05;

import java.util.Arrays;

public class BubbleSortParesImpares {

    public static void bubbleSortParesImpares(int[] vetor) {
        int n = vetor.length;
        int aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                boolean atualEhImpar = (vetor[j] % 2 != 0);
                boolean proximoEhPar = (vetor[j + 1] % 2 == 0);
                boolean mesmaParidade = (vetor[j] % 2 == vetor[j + 1] % 2);

                boolean deveTrocar = false;

                // 1º Critério: Se o atual é ímpar e o próximo é par, inverte
                if (atualEhImpar && proximoEhPar) {
                    deveTrocar = true;
                }
                // 2º Critério: Se têm a mesma paridade, ordena do menor para o maior
                else if (mesmaParidade && vetor[j] > vetor[j + 1]) {
                    deveTrocar = true;
                }

                if (deveTrocar) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {12, 5, 3, 8, 14, 7, 2};

        System.out.println("Vetor desordenado: " + Arrays.toString(numeros));
        bubbleSortParesImpares(numeros);
        System.out.println("Vetor pares e ímpares: " + Arrays.toString(numeros));
    }
}