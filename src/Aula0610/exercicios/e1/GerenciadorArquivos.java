package Aula0610.exercicios.e1;

import java.util.ArrayList;
import java.util.List;

class Arquivo {
    String nome;
    int tamanhoKB;

    public Arquivo(String nome, int tamanhoKB) {
        this.nome = nome;
        this.tamanhoKB = tamanhoKB;
    }
}

class Diretorio {
    String nome;
    List<Arquivo> arquivos = new ArrayList<>();
    List<Diretorio> subdiretorios = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    // TODO: Implemente este método recursivo
    public int calcularTamanhoTotal() {
        int total = 0;

        for (Arquivo arquivo : arquivos){
            total += arquivo.tamanhoKB;
        }
        for (Diretorio sub : subdiretorios){
            total += sub.calcularTamanhoTotal();
        }

        return total;
    }


}

