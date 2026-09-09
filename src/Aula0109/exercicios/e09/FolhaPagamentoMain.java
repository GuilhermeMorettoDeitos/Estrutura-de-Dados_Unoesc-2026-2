package Aula0109.exercicios.e09;

public class FolhaPagamentoMain {
    public static void main(String[] args) {

        FolhaPagamentoService folhaService = new FolhaPagamentoService();

        Funcionario f1 = new Funcionario("João", 3500.00);
        Funcionario f2 = new Funcionario("Maria", 4800.50);
        Funcionario f3 = new Funcionario("Pedro", 2900.00);

        folhaService.adicionarFuncionario(f1);
        folhaService.adicionarFuncionario(f2);
        folhaService.adicionarFuncionario(f3);

        folhaService.calcularTotalSalarios();
    }
}