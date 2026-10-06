 public class Produto {
    public static void main(String[] args) {

        String nomeProduto = "Hambúrguer";
        double precoProduto = 39.90;
        int quantidadeDisponivel = 10;
        boolean produtoAtivo = true;

        final double TAXA_ENTREGA = 5.00;
        final double TAXA_SERVICO = 2.00;

        int quantidadePedido = 2;

        double precoTotal = (precoProduto * quantidadePedido)
                + TAXA_ENTREGA
                + TAXA_SERVICO;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: R$ " + precoProduto);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
        System.out.println("Produto ativo: " + produtoAtivo);
        System.out.println("Preço total do pedido: R$ " + precoTotal);
    }
}