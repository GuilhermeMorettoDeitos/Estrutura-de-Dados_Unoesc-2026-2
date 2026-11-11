package Aula1011.BubbleSort.exercicios.e01;

public class BubbleSortDouble {

    public static void bubbleSort(double[] vetor) {
        int n = vetor.length;
        double aux;

        // Laço externo para percorrer todo o vetor
        for (int i = 0; i < n - 1; i++) {
            // Laço interno para comparar elementos adjacentes
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Realiza a troca (swap)
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Preços fornecidos no exercício 1
        double[] precos = {29.90, 5.50, 100.0, 15.75, 45.0, 2.99};

        System.out.println("Preços desordenados:");
        exibirVetor(precos);

        bubbleSort(precos);

        System.out.println("\nPreços ordenados (do mais barato ao mais caro):");
        exibirVetor(precos);
    }

    public static void exibirVetor(double[] vetor) {
        for (double i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
