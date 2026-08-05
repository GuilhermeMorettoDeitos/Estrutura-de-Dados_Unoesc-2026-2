package Aula2707;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        System.out.println("Olá Mundo Java!");
//
//        String nome = "Gui";
//        int idade = 0;
//        BigDecimal valor = BigDecimal.valueOf(10,5);
//        double teste = 10.25;
//        float teste2 = 2;
//
//        System.out.println("Nome: " + nome);

        //Utilizando o tad de produto

        Produto produto01 = new Produto(1,"Notebook", "ajklajdkfjak",3000.9);
        Produto produto02 = new Produto(1, "Smartphone", "6553696", 2001.5);


        //Utilizando o tad de cliente
        Cliente cliente01 = new Cliente(1, "Carlos", "carlos@mail.co", "rua1", "7888852852");
        Cliente cliente02 = new Cliente(2, "Julio", "julio@mail.co", "rua23", "48585858233");

        //adicionando os produtos em uma lista
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto01);
        produtos.add(produto02);

        //adicionando os clientes em uma lista
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente01);
        clientes.add(cliente02);

        //mostrando a lsita de produtos
        for(Produto produto : produtos){
            System.out.println(produto.toString());
        }

        //mostrando a lsita de clientes
        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }


    }
}
