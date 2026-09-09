package Aula0109.exercicios.e15;

import java.util.ArrayList;
import java.util.List;

public class EleicaoService {

    private List<Candidato> candidatos = new ArrayList<>();

    public void adicionarCandidato(Candidato c) {
        candidatos.add(c);
    }

    public void votar(String nomeCandidato) {
        for (Candidato c : candidatos) {
            if (c.getNome().equalsIgnoreCase(nomeCandidato)) {
                c.incrementarVoto();
                System.out.println("Voto registrado para " + c.getNome());
                return;
            }
        }
        System.out.println("Candidato " + nomeCandidato + " não encontrado.");
    }

    public void exibirVencedor() {
        if (candidatos.isEmpty()) {
            System.out.println("Nenhum candidato cadastrado.");
            return;
        }

        Candidato vencedor = candidatos.get(0);
        for (Candidato c : candidatos) {
            if (c.getVotos() > vencedor.getVotos()) {
                vencedor = c;
            }
        }

        System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");
        for (Candidato c : candidatos) {
            System.out.println("Candidato: " + c.getNome() + " | Votos: " + c.getVotos());
        }
        System.out.println("----------------------------");
        System.out.println("VENCEDOR: " + vencedor.getNome() + " com " + vencedor.getVotos() + " voto(s)!");
        System.out.println("============================\n");
    }
}