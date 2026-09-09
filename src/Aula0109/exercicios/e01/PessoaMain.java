package Aula0109.exercicios.e01;

public class PessoaMain {

    public static void main(String[] args){

        PessoaService pessoaService = new PessoaService();

        //populando lista do tad
        Pessoa pessoa1 = new Pessoa("Ana",17);
        Pessoa pessoa2 = new Pessoa("Gabriel",18);
        pessoaService.adicionarPessoa(pessoa1);
        pessoaService.adicionarPessoa(pessoa2);

        pessoaService.dadosPessoa();
        pessoaService.maiorDeIdade(pessoa1);

    }

}
