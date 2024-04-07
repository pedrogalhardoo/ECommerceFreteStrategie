package com.mycompany.ecommercepaymentstrategies;

public class SedexFrete implements FreteStrategy {
    @Override
    public double calculaFrete(int distancia) {
        return distancia * 1.5; // Exemplo de cálculo para Sedex
    }
}