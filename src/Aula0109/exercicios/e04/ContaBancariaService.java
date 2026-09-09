package Aula0109.exercicios.e04;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaService {

    List<ContaBancaria> cliente = new ArrayList<>();

    public void adicionarCliente(ContaBancaria contaBancaria){
        cliente.add(contaBancaria);
    }

    public void depositar(ContaBancaria contaBancaria, double valor){
        contaBancaria.setSaldo(contaBancaria.getSaldo()+valor);
        System.out.println("O valor de R$" + valor + " foi creditado à sua conta. Saldo atual: " + contaBancaria.getSaldo());
    }

    public void sacar(ContaBancaria contaBancaria, double valor){
        if(valor > contaBancaria.getSaldo()){
            System.out.println(" - AVISO: Impossível realizar a operação. SALDO INSUFICIENTE. Saldo atual: R$" + contaBancaria.getSaldo());
        } else {
            contaBancaria.setSaldo(contaBancaria.getSaldo()-valor);
            System.out.println("O valor de R$" + valor + " foi sacado de sua conta. Saldo atual: " + contaBancaria.getSaldo());
        }
    }

    public void consultarSaldo(ContaBancaria contaBancaria){
        System.out.println("O saldo do cliente " + contaBancaria.getTitular() + " é de R$" + contaBancaria.getSaldo());
    }

}
