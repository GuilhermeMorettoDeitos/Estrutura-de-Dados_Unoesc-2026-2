package Aula0109.exercicios.e04;

public class ContaBancariaMain {
    public static void main(String[] args){

        ContaBancariaService contaBancariaService = new ContaBancariaService();

        ContaBancaria contaBancaria = new ContaBancaria("Guilherme");
        contaBancariaService.adicionarCliente(contaBancaria);

        contaBancariaService.depositar(contaBancaria, 500);
        contaBancariaService.sacar(contaBancaria, 400);
        contaBancariaService.consultarSaldo(contaBancaria);

    }
}
