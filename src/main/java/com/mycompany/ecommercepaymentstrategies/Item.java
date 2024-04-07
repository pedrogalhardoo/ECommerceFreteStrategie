package com.mycompany.ecommercepaymentstrategies;

public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }
}