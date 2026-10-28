package Aula2710.AulaEstudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProdutoMain {
    public static void main(String[] args){

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 2499.59));
        produtos.add(new Produto("Mouse", 90.50));
        produtos.add(new Produto("Teclado", 199.99));

        Collections.sort(produtos, new Comparator<Produto>(){

            public int compare(Produto p1, Produto p2){
                return Double.compare(p1.getPreco(), p2.getPreco());
            }

        });

        System.out.println(produtos);
    }
}
