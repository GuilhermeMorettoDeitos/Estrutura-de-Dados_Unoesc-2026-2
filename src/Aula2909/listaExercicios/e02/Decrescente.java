package Aula2909.listaExercicios.e02;

public class Decrescente {

    public static void geraDecrescente(int numero){
        if(numero > 0){
            System.out.println(numero);
            geraDecrescente(numero - 1);
        }
    }

    public static void main(String[] args){
        geraDecrescente(15);
    }
}

