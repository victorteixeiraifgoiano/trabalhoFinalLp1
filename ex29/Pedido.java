package trabalhofinal.ex29;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<ItemPedido> itens;
    private String formaPagamento;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void efetuarPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
        // Lógica para processar o pagamento
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}
