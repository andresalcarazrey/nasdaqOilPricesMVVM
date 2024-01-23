package com.politecnicomalaga.NasdaqOilPrices.Model;

import java.util.ArrayList;
import java.util.List;

public class PricesCollection {

    //Agregación de un montón de precios
    private List<Price> myPricesList;

    public PricesCollection() {
        myPricesList = new ArrayList<Price>();
    }

    //Métodos CRUD o de gestión de la colección
    //que hemos encapsulado

    //Añadir un price a la lista
    public void add(Price p) {

    }


    //Añadir un precio dado los valores
    public void add(String fecha, float precio, String tendencia) {

    }


    //Buscar un precio por fecha
    public Price search(String fecha) {
        Price p = new Price("2024-03-01", 4f, "down");
        return p;
    }


    //Devolver una copia en forma de array de los precios
    public Price[] getCopy() {
        return null;
    }





}
