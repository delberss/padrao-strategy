package org.example;

public class ImpostoICMS implements Imposto {
    public float calcular(float rendaBruta, float deducoes) {
        return (rendaBruta - deducoes) * 0.18f;
    }
}