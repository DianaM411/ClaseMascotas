package com.diana;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //LLAMO AL METODO INVENTARIO
       menuInventario();
    }


    public static void menuInventario() {

        Scanner leer = new Scanner(System.in);

        // CREAMOS LOS OBJETOS ANIMALES
        //-----------------------------
        Perro Kiki = new Perro("Kiki", 2, 3, "08/05/2019", "pug", true);
        Gato Coco = new Gato("Coco", 2, 3, "08/05/2019", "gris", true);
        Canario Karl = new Canario("Karl", 2, 3, "08/05/2019", "pico", true, "Madagascar", true);
        Loro Cookie = new Loro("Cookie", 2, 3, "08/05/2019", "pico", true, "azul", true);


        // CREAMOS EL ARRAYLIST
        //-----------------------------------------
        Inventario inventario = new Inventario();
        inventario.getListaAnimales().add(Kiki);
        inventario.getListaAnimales().add(Coco);
        inventario.getListaAnimales().add(Karl);
        inventario.getListaAnimales().add(Cookie);


        //MENU
        //---------------------
        boolean salir = false;
        int menu;

        while (!salir) {
            System.out.println("      ");
            System.out.println("Que accion quieres realizar?");
            System.out.println("   ");
            System.out.println("1. Mostrar la lista de animales.");
            System.out.println("2. Mostrar todos los datos de un animal concreto.");
            System.out.println("3. Mostrar todos los datos de todos los animales.");
            System.out.println("4. Insertar animales en el inventario.");
            System.out.println("5. Eliminar animales del inventario.");
            System.out.println("6. Vaciar el inventario.");
            System.out.println("7. Salir.");
            System.out.println("      ");

            menu = leer.nextInt();


            switch (menu) {
                case 1:
                    for (Mascotas b : inventario.getListaAnimales()) {
                        b.muestraNombre();
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 2:
                    Scanner leer1 = new Scanner(System.in);
                    System.out.println("Que animal quieres ver?");
                    String respuesta = leer1.nextLine();

                    for (Mascotas a : inventario.getListaAnimales()) {
                        if (a.getNombre().equalsIgnoreCase(respuesta)) {
                            a.muestra();
                        }
                    }

                    System.out.println("----------------------------------------");
                    break;

                case 3:
                    //IMPRIMIR EL TAMANO DE LA LISTA
                    System.out.println("En el inventario hay: " + inventario.getListaAnimales().size() + " animales.");

                    //IMPRIMIR TODOS LOS DATOS DE TODOS LOS ANIMALES
                    for (int i = 0; i < inventario.getListaAnimales().size();
                         i++) {
                        System.out.println(inventario.getListaAnimales().get(i).toString());
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 4:
                    boolean sal = false;
                    while (!sal) {
                        Scanner leer3 = new Scanner(System.in);
                        System.out.println("Que tipo de animal quieres anadir al inventario? (1. perro) (2. gato) (3. loro) (4. canario) (5. salir)");
                        int newAnimal = leer3.nextInt();
                        switch (newAnimal) {
                            case 1:
                                Perro perro = new Perro("perro", 2, 3, "08/05/2019", "pug", true);
                                perro.anadirAnimal();
                                perro.muestra();
                                inventario.getListaAnimales().add(perro);
                                break;
                            case 2:
                                Gato gato = new Gato("gato", 2, 3, "08/05/2019", "gris", true);
                                gato.anadirAnimal();
                                gato.muestra();
                                inventario.getListaAnimales().add(gato);
                                break;
                            case 3:
                                Loro loro = new Loro("loro", 2, 3, "08/05/2019", "pico", true, "azul", true);
                                loro.anadirAnimal();
                                loro.muestra();
                                inventario.getListaAnimales().add(loro);
                                break;
                            case 4:
                                Canario canario = new Canario("canario", 2, 3, "08/05/2019", "pico", true, "Madagascar", true);
                                canario.anadirAnimal();
                                canario.muestra();
                                inventario.getListaAnimales().add(canario);
                                break;
                            case 5:
                                sal = true;
                                break;
                            default:
                                System.out.println("ERROR!Esta operacion no existe.");
                        }
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 5:
                    System.out.println("----------------------------------------");

                    //ELIMINAR UN ELEMENTO DEL ARRAYLIST
                    Scanner leer2 = new Scanner(System.in);
                    System.out.println("Que animal quieres eliminar del inventario?");
                    String removeAnimal = leer2.nextLine();
                    Boolean eliminar = false;
                    Mascotas mascotaeliminar = null;
                    for (Mascotas c : inventario.getListaAnimales()) {
                        if (c.getNombre().equalsIgnoreCase(removeAnimal)) {
                            eliminar = true;
                            mascotaeliminar = c;
                        }
                    }
                    if (eliminar) {
                        inventario.getListaAnimales().remove(mascotaeliminar);
                    }

                    System.out.println(removeAnimal + " ha sido eliminado del inventario.");
                    System.out.println("Ahora el inventario tiene: " + inventario.getListaAnimales().size() + " animales.");
                    break;

                case 6:
                    System.out.println("----------------------------------------");
                    //ELIMINAR TODOS LOS VALORES DE UN ARRAYLIST
                    inventario.getListaAnimales().clear();
                    System.out.println("El inventario tiene: " + inventario.getListaAnimales().size() + " animales.");
                    break;

                case 7:
                    salir = true;
                    break;

                default:
                    System.out.println("ERROR!Esta operacion no existe.");

            }
        }
    }
}


