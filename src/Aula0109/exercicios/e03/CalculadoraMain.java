package Aula0109.exercicios.e03;

public class CalculadoraMain {
    public static void main(String[] args){
        CalculadoraService calculadoraService = new CalculadoraService();

        Calculadora calculadora = new Calculadora(5,2);
        calculadoraService.adicionarNumero(calculadora);

        Calculadora calculadora1 = new Calculadora(5,10);
        calculadoraService.adicionarNumero(calculadora1);

        calculadoraService.somar(calculadora);
        calculadoraService.subtrair(calculadora);
        calculadoraService.multiplicar(calculadora);
        calculadoraService.dividir(calculadora);
    }
}
