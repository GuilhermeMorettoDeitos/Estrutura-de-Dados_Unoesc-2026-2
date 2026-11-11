package Aula1011.atividadesMergeSort.e07;

import java.util.Arrays;

public class MergeSortTamanhoPalavra {

    public static void main(String[] args) {
        String[] palavras = {"java", "estrutura", "oi", "algoritmo"};

        System.out.println("Antes:  " + Arrays.toString(palavras));
        mergeSort(palavras, 0, palavras.length - 1);
        System.out.println("Depois: " + Arrays.toString(palavras));
    }

    // Método principal que divide o array (mantido igual ao do professor)
    public static void mergeSort(String[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Ordena a metade esquerda
            mergeSort(v, inicio, meio);
            // Ordena a metade direita
            mergeSort(v, meio + 1, fim);

            // Combina as duas metades ordenadas
            intercalar(v, inicio, meio, fim);
        }
    }

    // Método que une (intercala) duas metades ordenadas
    public static void intercalar(String[] v, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        String[] esq = new String[n1];
        String[] dir = new String[n2];

        for (int i = 0; i < n1; i++) {
            esq[i] = v[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            dir[j] = v[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = inicio;

        // MUDANÇA AQUI: Compara e junta os elementos pelo tamanho da palavra (length)
        while (i < n1 && j < n2) {
            if (esq[i].length() <= dir[j].length()) {
                v[k] = esq[i];
                i++;
            } else {
                v[k] = dir[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes da esquerda (se houver)
        while (i < n1) {
            v[k] = esq[i];
            i++;
            k++;
        }

        // Copia os elementos restantes da direita (se houver)
        while (j < n2) {
            v[k] = dir[j];
            j++;
            k++;
        }
    }
}