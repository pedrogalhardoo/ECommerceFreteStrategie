package com.mycompany.ecommercepaymentstrategies;


import java.util.ArrayList;
import java.util.List;

// Classe do carrinho de compras
public class CarrinhoCompras {
    private List<Item> itens;
    private PagamentoStrategy estrategiaPagamento;
    private FreteStrategy estrategiaFrete;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(Item item) {
        this.itens.add(item);
    }

    public void removeItem(Item item) {
        this.itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
        estrategiaPagamento.pagar(calculaTotal());
    }

    public void defineEstrategiaFrete(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calculaFrete(int distancia) {
        if(estrategiaFrete == null) {
            throw new IllegalStateException("Estratégia de frete não definida.");
        }
        return estrategiaFrete.calculaFrete(distancia);
    }
}