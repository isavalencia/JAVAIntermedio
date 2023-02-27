/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaElectronica;


import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class MantenimientoAgenda {
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    
    //Guardar contactos
    public static void guardarContacto(String noDui, String telefono,String nombre, float salario, HashMap<String,Agenda> listaContactos) {
        if(listaContactos.containsKey(noDui)){
            System.out.println(ANSI_RED +"No se puede introducir el contacto.El noDui esta repetido");
        }else{
            listaContactos.put(noDui,new Agenda(noDui,telefono,nombre,salario));
            System.out.println(ANSI_YELLOW+"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");          
            System.out.println(ANSI_BLUE + " REGISTRO: " + ANSI_BLACK + noDui + ANSI_BLUE + " ¡ INSERTADO CORRECTAMENTE !");
        }
         
    }
    
    //Modificar productos o un solo contactos
    public static void modificarContacto(String noDui, HashMap<String,Agenda> listaContactos) {
        String telefono = null, nombre = null; 
        float salario = 0;
         Agenda agen = new Agenda(noDui, telefono,nombre, salario);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean salir = false;
        
      if(listaContactos.containsKey(noDui)){
           int campoamodifi = 0;
try{
          while (campoamodifi != 4) {
              System.out.println(ANSI_GREEN + "__________________________________________________");
              System.out.println(ANSI_GREEN + "______________________¿QUÉ  DESEAS MODIFICAR________________________");
              System.out.println(ANSI_GREEN + "|                                                |");
              System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           1.- Telefono del contacto" + ANSI_GREEN + "              |");
              System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           2.- Nombre del contacto" + ANSI_GREEN   + "                 |");
              System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           3.- Salario del contacto" + ANSI_GREEN  + "       |");
              System.out.println(ANSI_GREEN + "|" + ANSI_BLACK + "           4.- Salir" + ANSI_GREEN + "       |");
              System.out.println(ANSI_GREEN + "|                                                |");
              System.out.println(ANSI_GREEN + "__________________________________________________" + ANSI_BLACK);
              System.out.println("Introduce el numero de la opción que deseas modificar:");
              campoamodifi = sc.nextInt();
              String sal= Float.toString(salario);
              
             try{
              switch (campoamodifi) {
                  case 1:
                      System.out.println(ANSI_GREEN + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + ANSI_BLACK);
                      System.out.println("Introduce el telefono del contacto: ");
                      listaContactos.put(telefono, agen);
//                      listaContactos.put(telefono, new Agenda(noDui, telefono, nombre, salario));
                      System.out.println(ANSI_YELLOW + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + ANSI_BLACK);
                      System.out.println(ANSI_BLUE + " REGISTRO: " + ANSI_BLACK + telefono + ANSI_BLUE + "¡ MODIFICADO CORRECTAMENTE !");
                      break;
                  case 2:
                      System.out.println(ANSI_GREEN + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + ANSI_BLACK);
                      System.out.println("Introduce el nombre del contacto: ");
                      listaContactos.put(nombre,agen);
//                      listaContactos.put(nombre, new Agenda(noDui, telefono, nombre, salario));
                      System.out.println(ANSI_YELLOW + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + ANSI_BLACK);
                      System.out.println(ANSI_BLUE + " REGISTRO: " + ANSI_BLACK + nombre + ANSI_BLUE + "¡ MODIFICADO CORRECTAMENTE !");
                      break;
                  case 3:
                      System.out.println(ANSI_GREEN + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + ANSI_BLACK);
                      System.out.println("Introduce el salario del producto: ");
                      listaContactos.put(sal,agen);
                      //listaContactos.put(sal, new Agenda(noDui, telefono, nombre, salario));
                      System.out.println(ANSI_YELLOW + "¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬" + ANSI_BLACK);
                      System.out.println(ANSI_BLUE + " REGISTRO: " + ANSI_BLACK + sal + ANSI_BLUE + "¡ MODIFICADO CORRECTAMENTE !");
                      break;
                  case 4:
                      salir = true;
                      System.out.println(ANSI_CYAN+">>> SALISTE DE AGENDA >>>");
                      break;

              }
             }catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sc.next();
            }
          }
}catch(Exception e){
    e.printStackTrace();
}
        
      }else{
        System.out.println(ANSI_RED +"No hay ningun contacto con ese noDui");
      }
  }
    
    //Mostrar o Consultar contactos
    public static void mostrarContactos(HashMap<String,Agenda> listaContactos){
        //Iterator<String> contactos = listaContactos.keySet().iterator();
        
        System.out.println(ANSI_BLUE + "==============REGISTRO DE CONTACTOS GUARDADOS==============");
        System.out.println(ANSI_BLUE + " ______" + ANSI_BLACK + "Hay los siguiente contactos en la agenda:" + ANSI_BLUE + "_______");
        System.out.println(ANSI_BLUE +"--------------------------------------------------------------");
        System.out.printf("%10s %20s %5s %5s","No DUI","| TELÉFONO","| NOMBRE","| SALARIO");
        System.out.println();
        System.out.println(ANSI_BLUE +"--------------------------------------------------------------");
        for(Agenda a: listaContactos.values()){
            System.out.format("%12s %19s %7s %8s",a.getNoDui(), a.getTelefono(),a.getNombre(),a.getSalario());
//            System.out.printf(/*%10s %20s %5d %5c*/a.getNoDui()+ a.getTelefono()+a.getNombre()+ a.getSalario());
            //System.out.println(a.getNoDui()+ a.getTelefono()+a.getNombre()+ a.getSalario());                         
            System.out.println();
//        System.out.println(ANSI_BLUE + "|    " + ANSI_BLACK + "noDui: " +"\n"+  a.getNoDui()      + "| " 
//                                                            + "Teléfono: " +"\n"+ a.getTelefono() + "| " 
//                                                            +"Nombre: " +"\n"+ a.getNombre()      + "| "
//                                                            + "Salario: " +"\n"+ a.getSalario()   +  ANSI_BLUE + "                     |");
        
//        System.out.println(ANSI_BLUE + "|    " + ANSI_BLACK + "noDui: " + a.getNoDui() + ANSI_BLUE + "                     |");
//        System.out.println(ANSI_BLUE + "|    " + ANSI_BLACK + "Teléfono: " + a.getTelefono() + ANSI_BLUE + "                     |");
//        System.out.println(ANSI_BLUE + "|    " + ANSI_BLACK + "Nombre: " + a.getNombre() + ANSI_BLUE + "                     |");
//        System.out.println(ANSI_BLUE + "|    " + ANSI_BLACK + "Salario: " + a.getSalario() + ANSI_BLUE + "                     |");
//        System.out.println(ANSI_BLUE + "__________________________________________");
              
        }
        
        System.out.println(ANSI_BLUE +"--------------------------------------------------------------");
        
    }
      
    
    //Eliminar contactos
    public static void eliminarContactos(String noDui, HashMap<String, Agenda> listaContactos) {
        if(listaContactos.containsKey(noDui)){
            listaContactos.remove(noDui);
            System.out.println(ANSI_YELLOW+"¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println(ANSI_BLUE +"CONTACTO: "+ ANSI_BLACK + noDui + ANSI_BLUE+ "¡ ELIMINADO CORRECTAMENTE !");
        }else{
            System.out.println(ANSI_RED +"No hay ningun contacto con ese noDui.");
        }
    }
    
    //Archivo ubicación externa para almacenar el HashMap 
    final static String outputFilePath = "C:/ProyectosNetbeans/JIntermedio/JInter_Practica02/src/AgendaElectronica/AgendaElectronicaTarea2_Semana2_AgendaElectronica.txt";
    //Crear ARCHIVO
    public static void crearFile(HashMap<String, Agenda> listaContactos){
        
       // nuevo objeto archivo 
        File file = new File(outputFilePath);
        BufferedWriter bf = null;
        
        try{
            // crear un nuevo BufferedWriter para el fichero de salida
            bf= new BufferedWriter(new FileWriter(file));
            
            
            //Datos del archivo TXT
            bf.write("DETALLE DE CONTACTOS REGISTRADOS \n");
                //bf.write("\n"+ listaContactos.toString());
            bf.write("---------------------------------------------------------- \n");
            
            //iterar las entradas del mapa
            for (Map.Entry<String, Agenda> entry: listaContactos.entrySet()){
                
                bf.write(entry.toString()+ "\n");
                bf.write("---------------------------------------------------------- \n");
                bf.newLine();
                
            }
            bf.flush();
            
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
        finally{
            try{
                bf.close();
            }catch(Exception e){
                System.out.println("ERROR! ");
                
            }
        }
    }
    
    
    
    
    
}
