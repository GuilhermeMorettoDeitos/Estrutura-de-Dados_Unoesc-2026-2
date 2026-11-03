package Aula2710.Exercicios.CollectionsSort.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrnenacaoCrescenteEDecrescenteDeNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 45, 12, 89, 3, 34, 7);

        Collections.sort(numeros);
        System.out.println("Ordem crescente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + numeros);
    }
}


