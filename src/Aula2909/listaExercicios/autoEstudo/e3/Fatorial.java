package Aula2909.listaExercicios.autoEstudo.e3;

public class Fatorial {

    public static int calcularFatorial(int n){

        if(n > 1){
            n = n*calcularFatorial(n-1);
        }
        return n;
    }

    public static void main(String[] args){
        System.out.println(calcularFatorial(5));
    }
}
