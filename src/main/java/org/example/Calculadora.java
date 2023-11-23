package org.example;

public class Calculadora {

    private float rendaBruta;
    private float deducoes;

    public Calculadora(float rendaBruta, float deducoes) {
        this.rendaBruta = rendaBruta;
        this.deducoes = deducoes;
    }

    public float calcular(Imposto imposto) {
        return imposto.calcular(rendaBruta, deducoes);
    }
}
