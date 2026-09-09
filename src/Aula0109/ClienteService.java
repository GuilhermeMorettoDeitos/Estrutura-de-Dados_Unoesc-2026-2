package Aula0109;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarCliente(){

        for(Cliente cliente: clientes){
            System.out.println("Nome: " + cliente.getNome() + "Email: " + cliente.getEmail());
        }

    }

}
