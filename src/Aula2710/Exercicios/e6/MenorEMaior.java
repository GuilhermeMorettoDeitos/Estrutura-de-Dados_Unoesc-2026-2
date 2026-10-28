package Aula2710.Exercicios.e6;

import java.util.Arrays;

public class MenorEMaior {
    public static void main(String[] args) {
        int[] numeros = {42, 7, 19, 88, 3, 56, 23, 91, 12, 34};
        Arrays.sort(numeros);
        System.out.println("Menor: " + numeros[0]);
        System.out.println("Maior: " + numeros[numeros.length - 1]);
    }
}
