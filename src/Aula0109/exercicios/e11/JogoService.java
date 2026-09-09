package Aula0109.exercicios.e11;

public class JogoService {

    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " atacou " + alvo.getNome() + " com força " + atacante.getForca() + "!");

        int novaVida = alvo.getVida() - atacante.getForca();
        alvo.setVida(novaVida);

        System.out.println("Vida restante de " + alvo.getNome() + ": " + alvo.getVida() + "\n");
    }
}