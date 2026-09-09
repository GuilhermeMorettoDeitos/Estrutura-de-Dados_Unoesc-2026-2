package Aula0109.exercicios.e04;

public class ContaBancaria {
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
