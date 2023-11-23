package org.example;

public class Contribuinte {

    private float imposto;

    public float getImposto() {
        return imposto;
    }


    public void calcularImpostoRenda(float rendaBruta, float deducoes) {
        Calculadora calculadora = new Calculadora(rendaBruta, deducoes);
        this.imposto = calculadora.calcular(new ImpostoRenda());
    }

    public void calcularImpostoICMS(float rendaBruta, float deducoes) {
        Calculadora calculadora = new Calculadora(rendaBruta, deducoes);
        this.imposto = calculadora.calcular(new ImpostoICMS());
    }

    public void calcularImpostoIPI(float rendaBruta, float deducoes) {
        Calculadora calculadora = new Calculadora(rendaBruta, deducoes);
        this.imposto = calculadora.calcular(new ImpostoIPI());
    }

}
