package Aula2710.Exercicios.e4;


import java.util.Arrays;

public class OrdenacaoParcial {
    public static void main(String[] args) {
        int[] numeros = {55, 33, 88, 11, 44, 22, 77};
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros, 1, 5);
        System.out.println(Arrays.toString(numeros));
    }
}