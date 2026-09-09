package Aula0109.exercicios.e08;

public class AgendaMain {
    public static void main(String[] args) {

        AgendaService agendaService = new AgendaService();

        Contato c1 = new Contato("Carlos Silva", "(49) 99999-1111");
        Contato c2 = new Contato("Mariana Lima", "(49) 98888-2222");

        agendaService.adicionarContato(c1);
        agendaService.adicionarContato(c2);

        agendaService.listarContatos();
    }
}