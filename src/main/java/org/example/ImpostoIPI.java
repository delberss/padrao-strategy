package org.example;

public class ImpostoIPI implements Imposto {
    public float calcular(float rendaBruta, float deducoes) {
        return (rendaBruta - deducoes) * 0.12f;
    }
}
