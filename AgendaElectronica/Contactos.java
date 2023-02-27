/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaElectronica;

import static AgendaElectronica.MantenimientoAgenda.ANSI_CYAN;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Contactos {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        MantenimientoAgenda mantea = new MantenimientoAgenda();
        HashMap<String, Agenda> listaContactos = new HashMap<String, Agenda>();

       

        String noDui = null, nombre = null, telefono = null;
        float salario = 0;

        Agenda agen = new Agenda(noDui, telefono, nombre, salario);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean salir = false;
        int opcionElegida = 0;

        while (opcionElegida != 5) {
            System.out.println(ANSI_PURPLE + "__________________AGENDA ELECTRONICA______________");
            System.out.println(ANSI_GREEN + "__________________________________________________");
            System.out.println(ANSI_GREEN + "______________________MENÚ________________________");
            System.out.println(ANSI_GREEN + "|                                                |");
            System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           1.- Registrar Contacto" + ANSI_GREEN + "               |");
            System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           2.- Modificar Contacto" + ANSI_GREEN + "               |");
            System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           3.- Mostrar todos los Contacto" + ANSI_GREEN + "       |");
            System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           4.- Eliminar Contacto" + ANSI_GREEN + "                |");
            System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           5.- Salir" + ANSI_GREEN + "                            |");
            System.out.println(ANSI_GREEN + "|                                                |");
            System.out.println(ANSI_GREEN + "__________________________________________________" + ANSI_BLACK);
            System.out.println("Introduce el numero de la opción que deseas:");
            opcionElegida = sc.nextInt();

            try {
                switch (opcionElegida) {
                    case 1:
                        System.out.println(ANSI_GREEN + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println(ANSI_GREEN + "-------------REGISTRANDO NUEVO CONTACTO-------------------" + ANSI_BLACK);
                        System.out.println(">>>Introduce el No Dui: ");
                        noDui = sc.next();
                        System.out.println(">>>Introduce el Telefono:");
                        telefono = sc.next();
                        System.out.println(">>>Introduce el Nombre:");
                        nombre = sc.next();
                        try {
                            System.out.println(">>>Introduce el Salario:");
                            salario = sc.nextFloat();
                        } catch (Exception e) {
                            System.out.println("Error al leer el numero");
                        }

                        mantea.guardarContacto(noDui, telefono, nombre, salario, listaContactos);
                        break;
                    case 2:
                        System.out.println(ANSI_GREEN + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println(ANSI_GREEN + "-------------MODIFICANDO CONTACTO-------------------" + ANSI_BLACK);
                        System.out.println("Introduce el noDui del contacto que quieres modificar: ");
                        noDui = sc.next();
                        mantea.modificarContacto(noDui, listaContactos);
                        break;
                    case 3:
                        mantea.mostrarContactos(listaContactos);
                        break;
                    case 4:
                        System.out.println(ANSI_GREEN + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println(ANSI_GREEN + "-------------ELIMINANDO CONTACTO-------------------" + ANSI_BLACK);
                        System.out.println("Introduce el noDui del contacto que quieres eliminar: ");
                        noDui = sc.next();
                        mantea.eliminarContactos(noDui, listaContactos);
                        break;
                    case 5:
                        salir = true;
                        System.out.println(ANSI_CYAN + ">>>========== SALISTE DE AGENDA ============>>>");
                        break;
                    default:
                        System.out.println("Tienes que introducir una opción validad ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
            
             //Crear archivo de texto
        MantenimientoAgenda.crearFile(listaContactos);

        }

        /*  Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion;
    
    while(!salir){
    
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            
            
            try{
            System.out.println("Escribe una de las opciones");           
            opcion = sn.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;
                    break;
                    
                default:
                   System.out.println("Solo números entre 1 y 4");
            }//switch
            }catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            }
            
    }
         */
    }

}
