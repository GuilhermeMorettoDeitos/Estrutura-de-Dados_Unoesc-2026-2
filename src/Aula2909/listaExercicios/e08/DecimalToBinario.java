package Aula2909.listaExercicios.e08;

public class DecimalToBinario {

    public static void conversor(int n){
        if (n == 1 || n == 0) {
            System.out.print(n);
        } else {
            if (n%2 == 0){
                conversor(n/2);
            } else {
                conversor((n-1) / 2);
            }
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args){
        conversor(18);
    }

}
