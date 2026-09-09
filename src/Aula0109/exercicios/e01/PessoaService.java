package Aula0109.exercicios.e01;

import Aula0109.Cliente;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void dadosPessoa(){
        for(Pessoa pessoa: pessoas){
            System.out.println("Nome: " + pessoa.getNome() + " - Idade: " + pessoa.getIdade());
        }
    }

    public void maiorDeIdade(Pessoa pessoa){
        if (pessoa.getIdade() >= 18){
            System.out.println(" - O(A) cliente " + pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(" - O(A) cliente " + pessoa.getNome() + " é menor de idade.");
        }
    }

}
