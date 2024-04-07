package com.mycompany.ecommercepaymentstrategies;

public class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via cartão de crédito.");
    }
}