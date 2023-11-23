package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveCalcularImpostoRenda() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.calcularImpostoRenda(100.0f, 20.0f);
        assertEquals(12.0f, contribuinte.getImposto());
    }

    @Test
    void deveCalcularImpostoICMS() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.calcularImpostoICMS(100.0f, 10.0f);
        assertEquals(16.2f, contribuinte.getImposto());
    }

    @Test
    void deveCalcularImpostoIPI() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.calcularImpostoIPI(100.0f, 10.0f);
        assertEquals(10.8f, contribuinte.getImposto());
    }
}