package Aula2710.AulaEstudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(89);
        numeros.add(25);
        numeros.add(9);
        numeros.add(3);

        Collections.sort(numeros);
        System.out.println(numeros);

        List<String> cidades = new ArrayList<>();
        cidades.add("Chapecó");
        cidades.add("Xanxerê");
        cidades.add("Ponte Serrada");
        cidades.add("Alegrete");

        Collections.sort(cidades);
        System.out.println(cidades);

        //Lista de numeros Decrescente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);

        //Lista de Strings Decrescente
        Collections.sort(cidades, Collections.reverseOrder());
        System.out.println(cidades);

    }
}
