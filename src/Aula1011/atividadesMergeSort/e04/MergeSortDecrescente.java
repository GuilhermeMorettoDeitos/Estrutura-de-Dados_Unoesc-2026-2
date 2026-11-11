package Aula1011.atividadesMergeSort.e04;

import java.util.Arrays;

public class MergeSortDecrescente {

    public static void main(String[] args) {
        int[] numeros = {15, 8, 25, 3, 12};

        System.out.println("Vetor original: " + Arrays.toString(numeros));
        mergeSort(numeros, 0, numeros.length - 1);
        System.out.println("Vetor ordenado: " + Arrays.toString(numeros)); // Saída Esperada: [3, 9, 10, 27, 38, 43, 82]
    }

    // Método recursivo que divide o vetor
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Ordena a metade da esquerda
            mergeSort(vetor, inicio, meio);

            // Ordena a metade da direita
            mergeSort(vetor, meio + 1, fim);

            // Junta as duas metades já ordenadas
            intercalar(vetor, inicio, meio, fim);
        }
    }

    // Método que combina (intercala) duas metades ordenadas
    public static void intercalar(int[] vetor, int inicio, int meio, int fim) {
        // Cria um vetor temporário para juntar os dados
        int[] helper = new int[vetor.length];

        for (int i = inicio; i <= fim; i++) {
            helper[i] = vetor[i];
        }

        int i = inicio;      // Ponteiro para a metade esquerda
        int j = meio + 1;    // Ponteiro para a metade direita
        int k = inicio;      // Ponteiro para o vetor original

        // Compara os elementos das duas metades e coloca o menor no vetor original
        while (i <= meio && j <= fim) {
            //para deixa-lo em ordem decrescente basta alterar a comparação <= do if abaixo para >=
            if (helper[i] >= helper[j]) {
                vetor[k] = helper[i];
                i++;
            } else {
                vetor[k] = helper[j];
                j++;
            }
            k++;
        }

        // Copia o que sobrou da metade esquerda (se houver)
        while (i <= meio) {
            vetor[k] = helper[i];
            i++;
            k++;
        }
    }
}