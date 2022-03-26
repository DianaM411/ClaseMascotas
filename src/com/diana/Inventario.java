package com.diana;

import java.util.ArrayList;

public class Inventario {

    //EL ARRAYLIST PRIVADO
    //--------------------
    private ArrayList<Mascotas> listaAnimales;

    //CONSTRUCTOR
    //-----------
    public Inventario() {listaAnimales = new ArrayList<Mascotas>();
    }

    //GETTERS Y SETTERS
    //-----------------
    public ArrayList<Mascotas> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Mascotas> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
}
