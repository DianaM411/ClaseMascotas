package com.diana;

import java.util.Scanner;

public class Loro extends Aves {
    //DEFINIMOS VARIABLES
    //----------------------------
    String colorLoro;
    boolean canta;


    //CONSTRUCTOR
    //----------------------------
    public Loro(String nombre, double edad, double estado, String fechaNacimiento, String pico, boolean vuela, String colorLoro, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.colorLoro = colorLoro;
        this.canta = canta;
    }


    //SETTERS y GETTERS
    //-----------------------------
    public String getColorLoro() {
        return colorLoro;
    }

    public void setColorLoro(String colorLoro) {
        this.colorLoro = colorLoro;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }


    //METODOS
    //-------------------
    public void volar() {
        System.out.println("Like a bird in the sky...");
    }

    public void muestra() {
        System.out.println(getNombre());
        System.out.println("----------------");
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha nacimiento: " + getFechaNacimiento());
        System.out.println("Pico: " + getPico());
        System.out.println("Vuela: " + isVuela());
        System.out.println("Color: " + getColorLoro());
        System.out.println("Canta: " + isCanta());
    }

    public void saluda() {
        System.out.println("Hola bola Mari Lola");
    }

    @Override
    public void anadirAnimal() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre del loro: ");
        String nom = leer.nextLine();
        setNombre(nom);

        System.out.println("Introduzca la edad: ");
        double ed = leer.nextDouble();
        setEdad(ed);

        System.out.println("Introduzca el estado: ");
        double est = leer.nextDouble();
        leer.nextLine();
        setEstado(est);

        System.out.println("Introduzca la fecha de nacimiento: ");
        String fech = leer.nextLine();
        setFechaNacimiento(fech);

        System.out.println("Introduzca el pico: ");
        String pic = leer.nextLine();
        setPico(pic);

        System.out.println("Vuela? true / false");
        boolean vuel = leer.nextBoolean();
        leer.nextLine();
        setVuela(vuel);

        System.out.println("Introduzca el color: ");
        String coll = leer.nextLine();
        setColorLoro(coll);

        System.out.println("Canta? true / false");
        boolean cant = leer.nextBoolean();
        setCanta(cant);
    }

    @Override
    public void muestraNombre() {
        System.out.println("Nombre: " + getNombre() + "; Tipo: Loro;");
    }


    //OVERRIDE .toString
    //------------------
    @Override
    public String toString() {
        return "Loro{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                "pico='" + pico + '\'' +
                ", vuela=" + vuela +
                ", colorLoro='" + colorLoro + '\'' +
                ", canta=" + canta +
                '}';
    }
}
