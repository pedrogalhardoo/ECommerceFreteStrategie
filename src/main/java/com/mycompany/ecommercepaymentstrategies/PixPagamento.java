package com.mycompany.ecommercepaymentstrategies;

public class PixPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via Pix.");
    }
}