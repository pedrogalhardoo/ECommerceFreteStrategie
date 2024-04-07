package com.mycompany.ecommercepaymentstrategies;


public class ECommercePaymentStrategies {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("Livro", 50.0));
        carrinho.adicionaItem(new Item("Caneta", 5.0));

        // Definindo a estratégia de pagamento como Pix
        carrinho.realizaPagamento(new PixPagamento());

        // Se quiséssemos mudar para outra forma de pagamento:
        // carrinho.realizaPagamento(new CartaoPagamento());
        // carrinho.realizaPagamento(new BoletoPagamento());
        
        // Definindo a estratégia de frete como Sedex e calculando o frete
        carrinho.defineEstrategiaFrete(new SedexFrete());
        double frete = carrinho.calculaFrete(100); // Exemplo com 100 km de distância
        System.out.println("Frete via Sedex: R$ " + frete);

        // Para mudar para o frete normal:
        //carrinho.defineEstrategiaFrete(new NormalFrete());
        //frete = carrinho.calculaFrete(100);
        //System.out.println("Frete normal: R$ " + frete);
    }
}
