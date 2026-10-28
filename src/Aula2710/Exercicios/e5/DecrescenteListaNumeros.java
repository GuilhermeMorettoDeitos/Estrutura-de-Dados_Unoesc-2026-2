package Aula2710.Exercicios.e5;

import java.util.Arrays;
import java.util.Collections;

public class DecrescenteListaNumeros {
    public static void main(String[] args) {
        Integer[] numeros = {55, 33, 88, 11, 44, 22, 77};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
    }
}
