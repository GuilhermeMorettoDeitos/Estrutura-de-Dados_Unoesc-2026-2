package Aula2710.Exercicios.e2;

import java.util.Arrays;

public class OrdemAlfabetica {

    public static void main(String[] args) {
        String[] frutas = {"Banana", "Abacaxi", "Morango", "Laranja", "Uva"};

        System.out.println(Arrays.toString(frutas));

        //ordenação
        Arrays.sort(frutas);
        System.out.println(Arrays.toString(frutas));
    }
}
