package com.mycompany.ecommercepaymentstrategies;

public class NormalFrete implements FreteStrategy {
    @Override
    public double calculaFrete(int distancia) {
        return distancia * 1.0; // Exemplo de cálculo para frete normal
    }
}