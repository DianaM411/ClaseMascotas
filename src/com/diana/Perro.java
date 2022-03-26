package com.diana;

import java.util.Scanner;

public class Perro extends Mascotas {

    //DEFINIMOS VARIABLES
    //----------------------------
    String rasa;
    boolean pulgas;


    //CONSTRUCTOR
    //----------------------------
    public Perro(String nombre, double edad, double estado, String fechaNacimiento, String rasa, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.rasa = rasa;
        this.pulgas = pulgas;
    }


    //SETTERS y GETTERS
    //-----------------------------
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }


    //METODOS
    //--------------------
    public void muestra() {
        System.out.println(getNombre());
        System.out.println("----------------");
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha nacimiento: " + getFechaNacimiento());
        System.out.println("Rasa: " + getRasa());
        System.out.println("Tiene pulgas: " + isPulgas());
    }

    @Override
    public void muestraNombre() {
        System.out.println("Nombre: " + getNombre() + "; Tipo: Perro;");
    }


    @Override
    public void habla() {
        System.out.println("Ham ham ham!");
    }

    public void anadirAnimal(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre del perro: ");
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

        System.out.println("Introduzca la rasa: ");
        String ras = leer.nextLine();
        setRasa(ras);

       System.out.println("Tiene pulgas? true / false");
       boolean pulg = leer.nextBoolean();
        setPulgas(pulg);
    }

    // OVERRIDE .toString
    //------------------
    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", rasa='" + rasa + '\'' +
                ", pulgas=" + pulgas +
                '}';
    }
}
