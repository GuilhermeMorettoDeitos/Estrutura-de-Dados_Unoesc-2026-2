package Aula0610.exercicios.autoEstudo.e3;

import java.util.ArrayList;
import java.util.List;

class Comentario {
    String texto;
    List<Comentario> respostas = new ArrayList<>();

    public Comentario(String texto) {
        this.texto = texto;
    }


    // TODO: Implemente a contagem recursiva
    public int contarTotalComentarios() {
        int contagem = 0;

        for(Comentario resposta : respostas){
            contagem += 1 + resposta.contarTotalComentarios();
        }

        return contagem;
    }

    public static void main(String[] args){
        Comentario topico = new Comentario("Qual é o formato da terra?");
        Comentario resposta1 = new Comentario("Esférica");
        Comentario resposta2 = new Comentario("Geoide");
        Comentario resposta3 = new Comentario("Plana");
        Comentario subresposta1 = new Comentario("Você é burro!");
        Comentario subresposta11 = new Comentario("Burro é você!");

        topico.respostas.add(resposta1);
        topico.respostas.add(resposta2);
        topico.respostas.add(resposta3);

        resposta3.respostas.add(subresposta1);

        subresposta1.respostas.add(subresposta11);

        int respostas = topico.contarTotalComentarios();
        System.out.println(respostas);

    }

}
