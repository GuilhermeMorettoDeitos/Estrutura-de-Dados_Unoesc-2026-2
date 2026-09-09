package Aula0109.exercicios.e15;

public class EleicaoMain {

    public static void main(String[] args) {

        EleicaoService eleicao = new EleicaoService();

        Candidato c1 = new Candidato("Chapa A");
        Candidato c2 = new Candidato("Chapa B");

        eleicao.adicionarCandidato(c1);
        eleicao.adicionarCandidato(c2);

        // Simulando votos
        eleicao.votar("Chapa A");
        eleicao.votar("Chapa B");
        eleicao.votar("Chapa A");

        eleicao.exibirVencedor();
    }

}