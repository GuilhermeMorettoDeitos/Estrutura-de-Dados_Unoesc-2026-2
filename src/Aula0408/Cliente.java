package Aula0408;

public class Cliente {
    private int id;
    private int idCliente;
    private String nome;
    private String agencia;
    private double conta;
    private double saldo;
    private double saldoDevedor;
    private double credito;

    public Cliente(int id, int idCliente, String nome, String agencia, double conta, double saldo, double saldoDevedor, double credito) {
        this.id = id;
        this.idCliente = idCliente;
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.saldoDevedor = saldoDevedor;
        this.credito = credito;
    }

    public double getSaldoDevedor(){
        return saldo - saldoDevedor;
    }

    public String getDadosConta(){
        return "Dados: " + nome + " - " + conta;
    }

    public double funciton2(){
        return saldo + credito;
    }
}
