package Aula2710.Exercicios.CollectionsSort.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoBasicaStrings {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Japão");
        paises.add("Canadá");
        paises.add("França");
        paises.add("Austrália");

        System.out.println("Antes da ordenação: " + paises);

        Collections.sort(paises);

        System.out.println("Depois da ordenação: " + paises);
    }
}

