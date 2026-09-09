package Aula0109.exercicios.e03;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraService {

    List<Calculadora> numeros = new ArrayList<>();

    public void adicionarNumero(Calculadora calculadora){
        numeros.add(calculadora);
    }

    public void somar(Calculadora  calculadora){
        System.out.println("Soma: " + (calculadora.getNum1()+calculadora.getNum2()));
    }

    public void subtrair(Calculadora calculadora){
        System.out.println("Subtração: " + (calculadora.getNum1()-calculadora.getNum2()));
    }

    public void multiplicar(Calculadora calculadora){
        System.out.println("Multiplicação: " + (calculadora.getNum1()* calculadora.getNum2()));
    }

    public void dividir(Calculadora calculadora){
        System.out.println("Divisão: " + (calculadora.getNum1()/ calculadora.getNum2()));
    }

}
