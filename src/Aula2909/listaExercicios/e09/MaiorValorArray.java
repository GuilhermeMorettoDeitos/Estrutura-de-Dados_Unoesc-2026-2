package Aula2909.listaExercicios.e09;

public class MaiorValorArray {

    public static int encontrarMaior(int[] array, int indice) {
        if (indice == array.length - 1) {
            return array[indice];
        }

        int maiorDoResto = encontrarMaior(array, indice + 1);

        if (array[indice] > maiorDoResto) {
            return array[indice];
        } else {
            return maiorDoResto;
        }
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 9, 4, 8};
        System.out.println(encontrarMaior(lista, 0));
    }
}
