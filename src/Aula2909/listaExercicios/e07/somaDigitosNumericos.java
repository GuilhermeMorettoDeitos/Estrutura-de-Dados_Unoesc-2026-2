package Aula2909.listaExercicios.e07;

public class somaDigitosNumericos {

    public static int somaDigitos(int n){
        if (n == 0){
            return 0;
        }

        int ultimoDigito = n % 10;

        return ultimoDigito + somaDigitos(n / 10);
    }

    public static void main(String[] args){
        System.out.println(somaDigitos(1234));
    }


}
