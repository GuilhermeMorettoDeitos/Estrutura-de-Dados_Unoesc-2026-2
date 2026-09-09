package Aula0109.exercicios.e06;

public class CarroMain {
    public static void main(String[] args) {

        CarroService carroService = new CarroService();

        // Criando o motor e o carro
        Motor motorV8 = new Motor("V8 4.0", 450);
        Carro carro = new Carro("Mustang", motorV8);

        // Testando os métodos de ligar e desligar
        carroService.ligarCarro(carro);
        carroService.ligarCarro(carro); // Tentando ligar novamente
        carroService.desligarCarro(carro);
        carroService.desligarCarro(carro); // Tentando desligar novamente
    }
}