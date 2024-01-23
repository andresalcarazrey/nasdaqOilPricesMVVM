package com.politecnicomalaga.NasdaqOilPrices.Model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PriceTest {

    private static Price unPrecio;

    @BeforeClass
    public static void inicializar() {
        if (PriceTest.unPrecio == null) {
            PriceTest.unPrecio = new Price("2024-01-24",56.7f,"up");
        }
    }

    @Test
    public void constructorYGetters() {

        assertTrue(PriceTest.unPrecio.getDay().equals("2024-01-24"));
        assertTrue(PriceTest.unPrecio.getPrice() == 56.7f);
        assertTrue(PriceTest.unPrecio.getTrend().equals("down"));
    }

    @Test
    public void getDay() {

        Price unPrecio = new Price("2024-01-24",56.7f,"up");
        assertTrue(unPrecio.getDay().equals("2024-01-24"));
    }




    @Test
    public void getPrice() {
    }

    @Test
    public void getTrend() {
    }
}