package Aula2909.fatoração;

public class FatoracaoNumero {

    public static int fatoracao(int numero){
        if(numero == 0 || numero == 1){
            return 1;
        } else {
            return numero * fatoracao(numero - 1);
        }
    }

    public static void main(String[] args){
        int numero = 5;

        System.out.println("Fatoração de " + numero + " é " + fatoracao(numero));
    }
}
