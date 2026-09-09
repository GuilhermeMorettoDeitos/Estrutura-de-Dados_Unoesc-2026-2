package Aula0109.exercicios.e02;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {

    List<Produto> estoque = new ArrayList<>();

    public void adicionarProduto(Produto produto){estoque.add(produto);}

    public void listarEstoque(){
        for(Produto produto: estoque){
            System.out.println("Produto: " + produto.getNome() + " - Preço: " + produto.getPreco() + " - Quantidade: " + produto.getQuantidade());
        }
    }

}
