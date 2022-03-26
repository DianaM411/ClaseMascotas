package com.diana;

import java.util.Scanner;

public class Gato extends Mascotas {
    //DEFINIMOS VARIABLES
    //----------------------------
    String color;
    boolean peloLargo;


    //CONSTRUCTOR
    //----------------------------
    public Gato(String nombre, double edad, double estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    //SETTERS y GETTERS
    //-----------------------------
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }


    //METODOS
    //--------------------
    public void muestra() {
        System.out.println(getNombre());
        System.out.println("----------------");
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha nacimiento: " + getFechaNacimiento());
        System.out.println("Color: " + getColor());
        System.out.println("Tiene pelo largo: " + isPeloLargo());
    }

    @Override
    public void habla() {
        System.out.println("Miau miau miau");
    }

    @Override
    public void muestraNombre() {
        System.out.println("Nombre: " + getNombre() + "; Tipo: Gato;");
    }

    @Override
    public void anadirAnimal() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre del gato: ");
        String nom = leer.nextLine();
        setNombre(nom);

        System.out.println("Introduzca la edad: ");
        double ed = leer.nextDouble();
        setEdad(ed);

        System.out.println("Introduzca el estado: ");
        double est = leer.nextDouble();
        leer.nextLine();
        setEstado(est);

        System.out.println("Introduzca la fecha de nacimiento: "); //pasa algo raro
        String fec = leer.nextLine();
        setFechaNacimiento(fec);

        System.out.println("Introduzca el color: ");
        String col = leer.nextLine();
        setColor(col);

        System.out.println("Tiene pelo largo? true / false");
        boolean pel = leer.nextBoolean();
        setPeloLargo(pel);
    }

    //OVERRIDE .toString
    //------------------
    @Override
    public String toString() {
        return "Gato{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                "color='" + color + '\'' +
                ", peloLargo=" + peloLargo +
                '}';
    }
}
