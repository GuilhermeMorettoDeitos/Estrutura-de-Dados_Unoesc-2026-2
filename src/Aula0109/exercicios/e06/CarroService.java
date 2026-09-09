package Aula0109.exercicios.e06;

public class CarroService {

    public void ligarCarro(Carro carro) {
        if (carro.getMotor().isLigado()) {
            System.out.println("O carro " + carro.getModelo() + " já está ligado!");
        } else {
            carro.getMotor().setLigado(true);
            System.out.println("O carro " + carro.getModelo() + " foi LIGADO.");
        }
    }

    public void desligarCarro(Carro carro) {
        if (!carro.getMotor().isLigado()) {
            System.out.println("O carro " + carro.getModelo() + " já está desligado!");
        } else {
            carro.getMotor().setLigado(false);
            System.out.println("O carro " + carro.getModelo() + " foi DESLIGADO.");
        }
    }
}