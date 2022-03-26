package com.diana;

public abstract class Aves extends Mascotas {
    //DEFINIMOS VARIABLES
    //----------------------------
    String pico;
    boolean vuela;


    //CONSTRUCTOR
    //----------------------------
    public Aves(String nombre, double edad, double estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }


    //SETTERS y GETTERS
    //-----------------------------
    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }


    //METODO ABSTRACTO
    //-----------------------------
    public abstract void volar();
}
