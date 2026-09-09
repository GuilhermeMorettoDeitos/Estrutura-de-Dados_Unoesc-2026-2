package Aula0109;

public class ClienteMain {

    public static void main(String[] args){

        ClienteService clienteService = new ClienteService();

        Cliente cliente = new Cliente("Guilherme", "g@gmail.com");
        clienteService.adicionarCliente(cliente);

        Cliente cliente1 = new Cliente("Ana", "ana@gmail.com");
        clienteService.adicionarCliente(cliente1);

        clienteService.listarCliente();

    }

}
