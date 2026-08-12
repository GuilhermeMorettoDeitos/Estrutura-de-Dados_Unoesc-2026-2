package Aula0408;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente(1111,8787,"Cludio","bancomaster",111,5000,1200, 150);
        Cliente cliente02 = new Cliente(2222,1547,"André","BBB",222,2000,6500, 10);
        Cliente cliente03 = new Cliente(3333,9868,"Julia","Sicob",333,9000,851, 50);
        Cliente cliente04 = new Cliente(4444,7854,"Gabriel","valcred",444,1000,200, 90);
        Cliente cliente05 = new Cliente(5555,3258,"Lucas","ttty",555,100,2500, 110);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente01);
        clientes.add(cliente02);
        clientes.add(cliente03);
        clientes.add(cliente04);
        clientes.add(cliente05);

        for(Cliente cliente : clientes){
            System.out.println("Dados da conta: " + cliente.getDadosConta());
            System.out.println("Saldo devedor: " + cliente.getSaldoDevedor());
            System.out.println("Saldo + Crédito: " + cliente.funciton2());

            System.out.println();
        }

    }
}