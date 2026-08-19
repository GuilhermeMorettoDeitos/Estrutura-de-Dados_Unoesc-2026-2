package Aula1808;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasExercicio3 {

    public static void main(String[] args){

        List<String> produtosCarrinho = new ArrayList<>();

        produtosCarrinho.add("Maçã");
        produtosCarrinho.add("Arroz");
        produtosCarrinho.add("Leite");
        produtosCarrinho.add("Café");

        for(String produto : produtosCarrinho){
            System.out.println(">> " + produto);
        }

        produtosCarrinho.remove("Leite");
        produtosCarrinho.remove(1);


        System.out.println("\nLista atualizada:");
        for(String produto : produtosCarrinho){
            System.out.println(">> " + produto);
        }

    }

}
