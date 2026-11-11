package Aula1011.BubbleSort.exercicios.e02;

public class BubbleSortNotasDecrescente {

    public static void bubbleSortDecrescente(int[] vetor) {
        int n = vetor.length;
        int aux;

        // Laço externo
        for (int i = 0; i < n - 1; i++) {
            // Laço interno
            for (int j = 0; j < n - 1 - i; j++) {
                // A MUDANÇA OCORRE AQUI: Usar '<' para ordenar da maior para a menor
                if (vetor[j] < vetor[j + 1]) {
                    // Realiza a troca (swap)
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Notas fornecidas no exercício 2
        int[] notas = {7, 4, 10, 9, 6, 8, 5, 3};

        System.out.println("Notas desordenadas:");
        exibirVetor(notas);

        bubbleSortDecrescente(notas);

        System.out.println("\nNotas ordenadas (decrescente):");
        exibirVetor(notas);

        System.out.println("\nLista das 3 maiores notas");
        // Exibindo os 3 primeiros elementos (as 3 maiores notas)
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "º Lugar: " + notas[i]);
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}