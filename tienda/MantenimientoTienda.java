/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class MantenimientoTienda{
public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    
    //Guardar productos
    public static void guardarProducto(String codigo, float precio, HashMap<String, Float> listaProductos) {
        if(listaProductos.containsKey(codigo)){
            System.out.println(ANSI_RED +"No se puede introducir el producto.El codigo esta repetido");
        }else{
            listaProductos.put(codigo, precio);
            System.out.println(ANSI_YELLOW+"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");          
            System.out.println(ANSI_BLUE + " REGISTRO: " + ANSI_BLACK + codigo + ANSI_BLUE + " ¡ INSERTADO CORRECTAMENTE !");
        }
         
    }
    
    //Modificar productos o un solo producto
    public static void modificarPrecio(String codigo, HashMap<String, Float> listaProductos) {
        Scanner sc = new Scanner(System.in);
        if(listaProductos.containsKey(codigo)){
            System.out.println(ANSI_GREEN +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬"+ANSI_BLACK);
            System.out.println("Introduce el precio del producto: ");
            listaProductos.put(codigo, sc.nextFloat());
            System.out.println(ANSI_YELLOW +"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬"+ANSI_BLACK);
            System.out.println(ANSI_BLUE + " REGISTRO: " + ANSI_BLACK +codigo + ANSI_BLUE+"¡ MODIFICADO CORRECTAMENTE !");
            
        }else{
            System.out.println(ANSI_RED +"No hay ningun producto con ese código");
        }
    }
    
    //Mostrar o Consultar productos
    public static void mostrarProductos(HashMap<String, Float> listaProductos){
        String clave;
        Iterator<String> productos = listaProductos.keySet().iterator();
        System.out.println(ANSI_BLUE + "==============LISTA DE REGISTROS GUARDADOS==============");
        System.out.println(ANSI_BLUE +" ______"+ANSI_BLACK+"Hay los siguiente productos:"+ANSI_BLUE+"_______");
        System.out.println(ANSI_BLUE +"|                                         |");
        
        while(productos.hasNext()){
            clave = productos.next();
            System.out.println(ANSI_BLUE +"|    "+ANSI_BLACK +"clave " + "  -  " + listaProductos.get(clave) + ANSI_BLUE + "                     |");
            System.out.println(ANSI_BLUE +"__________________________________________");
        }
        
    }
    
    //Eliminar productos
    public static void eliminarProductos(String codigo, HashMap<String, Float> listaProductos) {
        if(listaProductos.containsKey(codigo)){
            listaProductos.remove(codigo);
            System.out.println(ANSI_YELLOW+"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println(ANSI_BLUE +"REGISTRO: "+ ANSI_BLACK + codigo + ANSI_BLUE+ "¡ ELIMINADO CORRECTAMENTE !");
        }else{
            System.out.println(ANSI_RED +"No hay ningun producto con ese código.");
        }
    }
    
    
}
