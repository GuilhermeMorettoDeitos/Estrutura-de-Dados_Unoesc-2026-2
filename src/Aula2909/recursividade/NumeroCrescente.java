package Aula2909.recursividade;

public class NumeroCrescente {

    public static void crescente(int desde, int ate){
        if(desde > ate){
            return;
        }

        System.out.println(desde);
        crescente(desde+1, ate);

    }

    public static void main(String[] args){
        crescente(1, 10);
    }
}
