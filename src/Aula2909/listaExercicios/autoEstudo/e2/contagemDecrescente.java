package Aula2909.listaExercicios.autoEstudo.e2;

public class contagemDecrescente {

    public static void contarDecrescente(int n){
        System.out.println(n);
        if(n > 1){
            contarDecrescente(n-1);
        }
    }

    public static void main(String[] args){
        contarDecrescente(10);
    }
}
