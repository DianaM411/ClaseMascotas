package com.diana;

public abstract class Mascotas {

    //DEFINIMOS VARIABLES
    //----------------------------
    String nombre;
    double edad;
    double estado;
    String fechaNacimiento;


    //CONSTRUCTOR
    //----------------------------
    public Mascotas(String nombre, double edad, double estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }


    //SETTERS y GETTERS
    //-----------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getEstado() {
        return estado;
    }

    public void setEstado(double estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //METODOS
    //-----------------------------
    public abstract void muestra();

    public abstract void muestraNombre();

    public abstract void anadirAnimal();

    public void habla() {
        System.out.println("Como habla el animal?");
    }

    public void cumpleanos() {
        System.out.println("El cumple de " + getNombre() + " es el: " + getFechaNacimiento());
    }

    public void morir() {
        System.out.println("RIP");
    }
}
