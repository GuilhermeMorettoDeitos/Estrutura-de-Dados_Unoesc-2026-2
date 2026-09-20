package Aula0809.exercicio2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FilaAtendimentoService {

    private int contadorChegada = 0;

    // Regra: Maior urgência primeiro. Em caso de empate, ordem de chegada
    private PriorityQueue<Paciente> fila = new PriorityQueue<>(
            Comparator.comparingInt(Paciente::getUrgencia).reversed()
                    .thenComparingInt(Paciente::getOrdemChegada)
    );

    public void adicionarPaciente(String nome, int idade, int urgencia) {
        contadorChegada++;
        Paciente paciente = new Paciente(nome, idade, urgencia, contadorChegada);
        fila.add(paciente);
        System.out.println("Paciente " + nome + " adicionado à fila. (Urgência: " + urgencia + ")");
    }

    public void proximoPaciente() {
        Paciente p = fila.peek();
        if (p != null) {
            System.out.println("Próximo da fila: " + p.getNome() + " (Urgência: " + p.getUrgencia() + ")");
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public void listarFila() {
        System.out.println("\n=== Fila de Atendimento ===");
        PriorityQueue<Paciente> copia = new PriorityQueue<>(fila);
        while (!copia.isEmpty()) {
            Paciente p = copia.poll();
            System.out.println(" - " + p.getNome() + " | Urgência: " + p.getUrgencia() + " | Chegada: " + p.getOrdemChegada());
        }
        System.out.println("===========================\n");
    }

    public void atenderPaciente() {
        Paciente p = fila.poll();
        if (p != null) {
            System.out.println("Atendendo paciente: " + p.getNome());
        } else {
            System.out.println("Não há pacientes para atender.");
        }
    }
}