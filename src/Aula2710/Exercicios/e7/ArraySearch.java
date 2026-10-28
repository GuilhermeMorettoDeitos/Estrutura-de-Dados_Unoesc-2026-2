package Aula2710.Exercicios.e7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        double[] precos = {19.99, 5.50, 100.0, 45.90, 3.25};
        Arrays.sort(precos);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor a ser buscado: ");
        double valor = scanner.nextDouble();

        System.out.println(Arrays.toString(precos));

        int indice = Arrays.binarySearch(precos, valor);
        if (indice >= 0) {
            System.out.println("Encontrado no índice: " + indice);
        } else {
            System.out.println("Não encontrado");
        }
    }
}
