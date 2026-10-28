package Aula2710.Exercicios.e1;

import java.util.Arrays;

public class OrdenarCrescente {

    public static void main(String[] args){
        int[] numeros = {42,7,15,1,99,23};


        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }

}
