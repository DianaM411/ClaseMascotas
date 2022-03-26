package com.diana;

import java.util.Scanner;

public class Canario extends Aves {
    //DEFINIMOS VARIABLES
    //----------------------------
    String origen;
    boolean habla;


    //CONSTRUCTOR
    //----------------------------
    public Canario(String nombre, double edad, double estado, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    //SETTERS y GETTERS
    //-----------------------------
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }


    //METODOS
    //------------------
    public void volar() {
        System.out.println("Fly, baby, flyyyy!");
    }

    public void muestra() {
        System.out.println(getNombre());
        System.out.println("----------------");
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha nacimiento: " + getFechaNacimiento());
        System.out.println("Pico: " + getPico());
        System.out.println("Vuela: " + isVuela());
        System.out.println("Origen: " + getOrigen());
        System.out.println("Habla: " + isHabla());
    }

    @Override
    public void habla() {
        System.out.println("Cip Cirip");
    }

    @Override
    public void muestraNombre() {
        System.out.println("Nombre: " + getNombre() + "; Tipo: Canario;");
    }

    @Override
    public void anadirAnimal() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre del canario: ");
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
        String ras = leer.nextLine();
        setPico(ras);

        System.out.println("Vuela? true / false");
        boolean vuel = leer.nextBoolean();
        leer.nextLine();
        setVuela(vuel);

        System.out.println("Introduzca el origen: ");
        String org = leer.nextLine();
        setOrigen(org);

        System.out.println("Habla? true / false");
        boolean hab = leer.nextBoolean();
        setHabla(hab);
    }

    //OVERRIDE .toString
    //------------------
    @Override
    public String toString() {
        return "Canario{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                "pico='" + pico + '\'' +
                ", vuela=" + vuela +
                ", origen='" + origen + '\'' +
                ", habla=" + habla +
                '}';
    }
}
