/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Productos {
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
       
        MantenimientoTienda mante = new MantenimientoTienda();
        HashMap<String,Float> listaProductos = new HashMap<String,Float>();
        
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        float precio;
        String codigo;
        
        
        while(opcionElegida !=5){
            System.out.println(ANSI_GREEN +"__________________________________________________");
            System.out.println(ANSI_GREEN +"______________________MENÚ________________________");
            System.out.println(ANSI_GREEN +"|                                                |");
            System.out.println(ANSI_GREEN +"|"+ ANSI_BLACK+  "           1.- Introducir producto"        +ANSI_GREEN+    "              |");
            System.out.println(ANSI_GREEN +"|"+ ANSI_BLACK+  "           2.- Modificar precio"           +ANSI_GREEN+ "                 |");
            System.out.println(ANSI_GREEN +"|"+ ANSI_BLACK+  "           3.- Mostrar todos los producto" +ANSI_GREEN+           "       |");
            System.out.println(ANSI_GREEN +"|"+ ANSI_BLACK+  "           4.- Eliminar producto"          +ANSI_GREEN+  "                |");
            System.out.println(ANSI_GREEN +"|"+ ANSI_BLACK+  "           5.- Salir"                      +ANSI_GREEN+"                            |");
            System.out.println(ANSI_GREEN +"|                                                |");
            System.out.println(ANSI_GREEN +"__________________________________________________"+ ANSI_BLACK);
            System.out.println("Introduce el numero de la opcion que deseas:");
            opcionElegida = sc.nextInt();
            
            
            switch (opcionElegida) {
                case 1:   
                    System.out.println(ANSI_GREEN +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                    System.out.println(ANSI_GREEN+"-------------INSERTANDO DATOS-------------------"+ANSI_BLACK);
                    System.out.println(">>>Introduce el código del producto: ");
                    codigo = sc.next();
                    System.out.println(">>>Introduce el precio del producto:");
                    precio = sc.nextFloat();
                    mante.guardarProducto(codigo, precio, listaProductos);
                    break;

                case 2:
                    System.out.println(ANSI_GREEN +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                    System.out.println(ANSI_GREEN+"-------------MODIFICANDO DATOS-------------------"+ANSI_BLACK);
                    System.out.println("Introduce el código del producto del que quieres cambiar el precio: ");
                    codigo = sc.next();                
                    mante.modificarPrecio(codigo, listaProductos);
                    break;
                case 3:                    
                    mante.mostrarProductos(listaProductos);
                    break;
                case 4:
                    System.out.println(ANSI_GREEN +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                    System.out.println(ANSI_GREEN+"-------------ELIMINANDO DATOS-------------------"+ANSI_BLACK);
                    System.out.println("Introduce el código del producto que quieres eliminar: ");
                    codigo = sc.next();                
                    mante.eliminarProductos(codigo, listaProductos);
                    break;
                case 5:
                    break;
                default:
                   System.out.println("Tienes que introducir una opción validad ");
            }
                     
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
