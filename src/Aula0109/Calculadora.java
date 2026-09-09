package Aula0109;
//MODULARIZAÇÃO

public class Calculadora {

    public static int soma(int a, int b){

        return a+b;

    }

    public static void exibirResultado(int resultado){
        System.out.println("O resultado da soma dos valores é: " + resultado);
    }

    public static int subtracao(int a, int b){

        return a-b;

    }

    public static void main(String[] args) {

//        int resultado = 10 + 20;
//        System.out.println(resultado);
//
//        int resultado1 = 16 + 20;
//        System.out.println(resultado1);

        int resultado = soma(10,15);
        exibirResultado(resultado); //

        System.out.println(resultado);

        int resultado2 = subtracao(50, 20);

        exibirResultado(resultado2);



    }

}
