package com.mycompany.ecommercepaymentstrategies;

public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via boleto bancário.");
    }
}