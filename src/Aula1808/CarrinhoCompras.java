package Aula1808;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    public static void main(String[] args){

        //Criando a lista carrinho.
        List<String> carrinho = new ArrayList<>();
        carrinho.add("Notebook Gamer");
        carrinho.add("Mouse sem fio");
        carrinho.add("Teclado Gamer");

        //Contando a quantidade de intens do carrinho.
        System.out.println("\nTotal de Itens do Carrinho: " + carrinho.size());

        for(String item : carrinho){
            System.out.println(">> " + item);
        }

        //Encontrando o item do carrinho pelo indice
        System.out.println("\nPrimeiro item do carrinho: " + carrinho.get(1));

        //Removendo item do carrinho
        carrinho.remove(1);
        //ou
        carrinho.remove("Teclado Gamer");

        for(String item : carrinho){
            System.out.println(">> " + item);
        }

    }

}
