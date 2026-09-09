package Aula0109.exercicios.e08;

import java.util.ArrayList;
import java.util.List;

public class AgendaService {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        System.out.println("=== LISTA DE CONTATOS ===");
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato contato : contatos) {
                System.out.println("Nome: " + contato.getNome() + " | Telefone: " + contato.getTelefone());
            }
        }
        System.out.println("=========================\n");
    }
}