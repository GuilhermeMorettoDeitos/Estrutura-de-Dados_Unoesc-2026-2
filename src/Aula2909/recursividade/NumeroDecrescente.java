package Aula2909.recursividade;

public class NumeroDecrescente {

    public static void geraDecrescente(int numero){
        if(numero > 0){
            System.out.println(numero);
            geraDecrescente(numero - 1);
        }
    }

    public static void main(String[] args){
        geraDecrescente(50);
    }
}
