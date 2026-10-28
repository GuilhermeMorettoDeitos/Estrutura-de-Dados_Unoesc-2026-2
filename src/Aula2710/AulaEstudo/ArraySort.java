package Aula2710.AulaEstudo;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {

        //Ordenando valores inteiros CRESCENTE
        int[] numeros = {10, 50 ,24 ,47};
        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        //Ordenando nomes em ordem alfabetica
        String[] carros = {"Volvo", "BMW", "Tesla", "Ford", "Ford A", "Fiat", "Chevrolet"};
        Arrays.sort(carros);

        System.out.println(Arrays.toString(carros));

        //Ordenação de inteiros por indice
        int[] listaNumerosIndice = {40, 10, 50, 20, 30, 85, 94, 65};
        Arrays.sort(listaNumerosIndice, 0, 4);

        System.out.println(Arrays.toString(listaNumerosIndice));

        //Ordenação de numeros inteiros DECRESCENTE
        Integer[] listaNumerosDecrescentes = {8,3,1,5,9,4};
        Arrays.sort(listaNumerosDecrescentes, Collections.reverseOrder());

        System.out.println(Arrays.toString(listaNumerosDecrescentes));

        //Ordenação de string DECRESCENTE
        String[] pessoas = {"Ana", "Marcelo", "Olavo", "Bruno", "Aline"};
        Arrays.sort(pessoas, Collections.reverseOrder());

        System.out.println(Arrays.toString(pessoas));




    }
}
