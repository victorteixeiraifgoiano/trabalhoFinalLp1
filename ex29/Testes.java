package trabalhofinal.ex29;

/* 
 * Alunos:
 *      Stéphany Lima Vital
 *      Víctor Emannuel de Souza Teixeira
 *      Welder Antônio de Moraes
*/

public class Testes {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 5.99, 100);
        Produto produto2 = new Produto("Feijão", 3.99, 50);

        Cliente cliente = new Cliente("João", "Rua A, 123", "123456789");

        Supermercado supermercado = new Supermercado();
        supermercado.adicionarProduto(produto1);
        supermercado.adicionarProduto(produto2);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(produto1, 2));
        pedido.adicionarItem(new ItemPedido(produto2, 3));

        double total = pedido.calcularTotal();
        System.out.println("Total do pedido: R$" + total);

        pedido.efetuarPagamento("Cartão de crédito");
        String formaPagamento = pedido.getFormaPagamento();
        System.out.println("Forma de pagamento: " + formaPagamento);
    }
}
