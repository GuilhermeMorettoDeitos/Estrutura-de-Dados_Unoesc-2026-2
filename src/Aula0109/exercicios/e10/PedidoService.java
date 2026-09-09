package Aula0109.exercicios.e10;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void calcularTotalPedido() {
        double total = 0;
        System.out.println("=== RESUMO DO PEDIDO ===");
        for (ItemPedido item : itens) {
            double subtotal = item.getSubtotal();
            total += subtotal;
            System.out.printf("- %s (x%d): R$ %.2f\n", item.getProduto(), item.getQuantidade(), subtotal);
        }
        System.out.printf("VALOR TOTAL: R$ %.2f\n", total);
        System.out.println("========================\n");
    }
}