package Aula0109.exercicios.e11;

public class JogoMain {
    public static void main(String[] args) {

        JogoService jogoService = new JogoService();

        Personagem guerreiro = new Personagem("Guerreiro", 100, 25);
        Personagem orc = new Personagem("Orc", 80, 15);

        jogoService.atacar(guerreiro, orc);
        jogoService.atacar(orc, guerreiro);
        jogoService.atacar(guerreiro, orc);
    }
}