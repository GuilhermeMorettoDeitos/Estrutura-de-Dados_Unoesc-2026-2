package Aula1711;

public class Exercicio1 {

    public static void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);

            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private static int particionar(int[] arr, int baixo, int alto) {
        int pivo = arr[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] dados = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original:");
        imprimirArray(dados);

        quickSort(dados, 0, dados.length - 1);

        System.out.println("\nArray ordenado:");
        imprimirArray(dados);
    }

    private static void imprimirArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}