package Aula0610.exercicios.e2;

public class FuncionarioMain {

    public static void main(String[] args){
        Funcionario gerenteRH = new Funcionario("Carla", "Gerente RH");

        Funcionario devSenior = new Funcionario("Alex", "Desenvolvedor");
        Funcionario devJunior = new Funcionario("Marcos", "Estagiario");

        gerenteRH.subordinados.add(devJunior);
        gerenteRH.subordinados.add(devSenior);

        String pesquisa = "pedro";
        Funcionario f1 = gerenteRH.buscarFuncionarioPorNome(pesquisa);
        if(f1 != null){
            System.out.println("Funcionario: " + f1.nome + " encontrado!");
        } else {
            System.out.println("Funcionario não encontrado.");
        }

    }

}


