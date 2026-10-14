package Aula0610.exercicios.autoEstudo.e1;

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

        // 1. Some o tamanho dos arquivos deste diretório
        for(Arquivo arquivo : arquivos){
            total += arquivo.tamanhoKB;
        }

        // 2. Chame recursivamente para os subdiretórios
//        for(Diretorio subdiretorio : subdiretorios){
//            total += subdiretorio.calcularTamanhoTotal();
//        }

        return total;
    }

    public static void main(String[] args){
        Diretorio esteComputador = new Diretorio("C:/");
        Arquivo foto = new Arquivo("Foto.png", 500);
        Arquivo indexhtml = new Arquivo("index.html", 1000);

        esteComputador.arquivos.add(foto);
        esteComputador.arquivos.add(indexhtml);

        Diretorio downloads = new Diretorio("C:/Downloads");
        esteComputador.subdiretorios.add(downloads);

        Arquivo cpuz = new Arquivo("CPU-Z.exe", 2000);
        downloads.arquivos.add(cpuz);



        System.out.println("Tamanho total: " + esteComputador.calcularTamanhoTotal());

    }
}
