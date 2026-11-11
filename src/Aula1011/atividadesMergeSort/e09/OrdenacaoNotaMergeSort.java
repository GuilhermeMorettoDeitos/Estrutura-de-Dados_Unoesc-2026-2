package Aula1011.atividadesMergeSort.e09;

import java.util.Arrays;

public class OrdenacaoNotaMergeSort {

    public static class Aluno {
        String nome;
        double nota;

        public Aluno(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        public double getNota() {
            return nota;
        }

        @Override
        public String toString() {
            return nome + " (Nota: " + nota + ")";
        }
    }

    public static void main(String[] args) {
        // Vetor de objetos Aluno
        Aluno[] alunos = {
                new Aluno("Guilherme", 9.5),
                new Aluno("Alysson", 7.0),
                new Aluno("Natan", 8.9),
                new Aluno("Maria", 10.0),
                new Aluno("João", 5.5)
        };

        System.out.println("Antes da ordenação:");
        System.out.println(Arrays.toString(alunos));

        // Chamada do Merge Sort
        mergeSort(alunos, 0, alunos.length - 1);

        System.out.println("\nDepois da ordenação (por nota):");
        System.out.println(Arrays.toString(alunos));
    }

    // Método principal que divide o array de objetos
    public static void mergeSort(Aluno[] v, int inicio, int fim) {
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

    // Método que une (intercala) duas metades de alunos ordenados pela nota
    public static void intercalar(Aluno[] v, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        Aluno[] esq = new Aluno[n1];
        Aluno[] dir = new Aluno[n2];

        // Copia os dados para os vetores temporários
        for (int i = 0; i < n1; i++) {
            esq[i] = v[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            dir[j] = v[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = inicio;

        // Compara e junta os elementos pela nota do Aluno
        while (i < n1 && j < n2) {
            if (esq[i].getNota() <= dir[j].getNota()) {
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