package Aula2909.listaExercicios.e01;

public class Crescente {

    public static void crescente(int ate){
        if(1 > ate){
            return;
        }

        System.out.println(ate);
        crescente(ate-1);

    }

    public static void main(String[] args){
        crescente(20);
    }

}
