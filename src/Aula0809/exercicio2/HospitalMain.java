package Aula0809.exercicio2;

public class HospitalMain {
    public static void main(String[] args) {
        FilaAtendimentoService atendimento = new FilaAtendimentoService();

        atendimento.adicionarPaciente("Maria", 65, 3);
        atendimento.adicionarPaciente("João", 30, 1);
        atendimento.adicionarPaciente("Pedro", 45, 5); // Maior urgência
        atendimento.adicionarPaciente("Ana", 25, 3); // Empate urgência com Maria

        atendimento.listarFila();
        atendimento.proximoPaciente();

        atendimento.atenderPaciente();
        atendimento.atenderPaciente();
    }
}