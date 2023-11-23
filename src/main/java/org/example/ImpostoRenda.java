package org.example;

public class ImpostoRenda implements Imposto {
    public float calcular(float rendaBruta, float deducoes) {
        return (rendaBruta - deducoes) * 0.15f;
    }
}