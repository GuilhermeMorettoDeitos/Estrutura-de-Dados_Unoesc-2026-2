package Aula2710.Exercicios.e3;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o tamanho da array:");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Numeros da array:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

