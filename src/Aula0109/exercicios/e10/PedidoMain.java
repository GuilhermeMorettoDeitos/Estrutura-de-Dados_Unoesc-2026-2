package Aula0109.exercicios.e10;

public class PedidoMain {
    public static void main(String[] args) {

        PedidoService pedidoService = new PedidoService();

        ItemPedido item1 = new ItemPedido("Mouse Gamer", 150.00, 2);
        ItemPedido item2 = new ItemPedido("Teclado Mecânico", 350.00, 1);

        pedidoService.adicionarItem(item1);
        pedidoService.adicionarItem(item2);

        pedidoService.calcularTotalPedido();
    }
}