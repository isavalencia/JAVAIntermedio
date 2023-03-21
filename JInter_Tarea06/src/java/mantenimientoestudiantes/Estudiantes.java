/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimientoestudiantes;

import java.util.InputMismatchException;
import java.util.Scanner;
import persistenciaestudiantes.IvEstudiantes;

/**
 *
 * @author Isabel
 */
public class Estudiantes {

    public static void main(String[] args) {
        
        MantenimeintoEstudiantesJpa manteestudiantes = new MantenimeintoEstudiantesJpa();

        String carnet = "", apellidos = "", nombres = "", direccion = "", telefono = "", carrera = "", departamento = "";

        IvEstudiantes estudiante = new IvEstudiantes();
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean salir = false;
        int opcionElegida = 0;

        while (opcionElegida != 5) {
            System.out.println("_______________REGISTRO DE ESTUDIANTES___________ ");
            System.out.println("__________________________________________________");
            System.out.println("______________________MENÚ________________________");
            System.out.println("|                                                |");
            System.out.println("|           1.- Registrar Estudiante             |");
            System.out.println("|           2.- Modificar Estudiante             |");
            System.out.println("|           3.- Consultar Estudiante             |");
            System.out.println("|           4.- Eliminar Estudiante              |");
            System.out.println("|           5.- Salir                            |");
            System.out.println("|                                                |");
            System.out.println("__________________________________________________");
            System.out.println("Introduce el numero de la opción que deseas:");
            opcionElegida = sc.nextInt();

            try {
                switch (opcionElegida) {
                    case 1:
                        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println("-------------REGISTRANDO NUEVO ESTUDIANTE-------------------");
                        System.out.println(">>>Introduce el No Carnet: ");
                        carnet=sc.next();
                        System.out.println(">>>Introduce Apellidos:");
                        apellidos = sc.next();
                        System.out.println(">>>Introduce Nombres:");
                        nombres = sc.next();
                        System.out.println(">>>Introduce Dirección:");
                        direccion = sc.next();
                        System.out.println(">>>Introduce Teléfono de estudiante:");
                        telefono = sc.next();
                        System.out.println(">>>Introduce Carrera de estudiante:");
                        carrera = sc.next();
                        System.out.println(">>>Introduce Departamento de estudiante:");
                        departamento = sc.next();
                        
                        estudiante.setCarnet(carnet);
                        estudiante.setApellidos(apellidos);
                        estudiante.setNombres(nombres);
                        estudiante.setDireccion(direccion);
                        estudiante.setTelefono(telefono);
                        estudiante.setCarrera(carrera);
                        estudiante.setDepartamento(departamento);

                        manteestudiantes.guardarEstudiante(estudiante);
               
                        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println(" REGISTRO: " + carnet + "¡ INSERTADO CORRECTAMENTE !");
                        break;
                    case 2:
                        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println("-------------MODIFICANDO ESTUDIANTE-------------------");
                        System.out.println("Introduce el No Carnet del estudiante que quieres modificar: ");
                        carnet = sc.next();

                        if (estudiante.equals(carnet)) {
                            int campoamodifi = 0;
                            try {
                                while (campoamodifi != 8) {
                                    System.out.println("____________________________________________________");
                                    System.out.println("_____________¿QUÉ  DESEAS MODIFICAR?________________");
                                    System.out.println("|                                                  |");
                                    System.out.println("|           1.- Carnet del estudiante              |");
                                    System.out.println("|           2.- Apellidos del estudiante           |");
                                    System.out.println("|           3.- Nombres del estudiante             |");
                                    System.out.println("|           4.- Dirección del estudiante           |");
                                    System.out.println("|           5.- Teléfono del estudiante            |");
                                    System.out.println("|           6.- Carrera del estudiante             |");
                                    System.out.println("|           7.- Departamento del estudiante        |");
                                    System.out.println("|           8.- Salir                              |");
                                    System.out.println("|                                                  |");
                                    System.out.println("____________________________________________________");
                                    System.out.println("Introduce el numero de la opción que deseas modificar:");
                                    campoamodifi = sc.nextInt();

                                    try {
                                        switch (campoamodifi) {
                                            case 1:
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce los apellidos del estudiante: ");
                                               
                                                estudiante.setCarnet(carnet);
//                      listaContactos.put(nombre, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + carnet + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                     
                                            case 2:
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce los apellidos del estudiante: ");
                                                
                                                estudiante.setApellidos(apellidos);
//                      listaContactos.put(nombre, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + apellidos + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                            case 3:
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce los nombres del estudiante: ");
                                                
                                                estudiante.setNombres(nombres);
                                                //listaContactos.put(sal, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + nombres + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                            case 4:
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce la dirección del estudiante: ");
                                                
                                                estudiante.setDireccion(direccion);
                                                //listaContactos.put(sal, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + direccion + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                            case 5:
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce el teléfono del estudiante: ");
                                                
                                                estudiante.setTelefono(telefono);
                                                //listaContactos.put(sal, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + telefono + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                            case 6: 
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce la carrera del estudiante: ");
                                                estudiante.setCarrera(carrera);;
                                                //listaContactos.put(sal, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + carrera + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                            case 7:
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println("Introduce el departamento del estudiante: ");
                                                
                                                estudiante.setDepartamento(departamento);
                                                //listaContactos.put(sal, new Agenda(noDui, telefono, nombre, salario));
                                                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                                                System.out.println(" REGISTRO: " + departamento + "¡ MODIFICADO CORRECTAMENTE !");
                                                break;
                                            case 8:
                                                salir = true;
                                                System.out.println(">>> SALISTE DE MANTENIMIENTO >>>");
                                                break;
                                                
                                           
                                        }
                                         
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debes insertar un número");
                                        sc.next();
                                        
                                    }
                                    
                                    
                                }
                                 
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            
                              
                        } else {
                            System.out.println("No hay ningun contacto con ese no carnet");
                        } 
                       
                        
                        manteestudiantes.modificarEstudiante(carnet, apellidos, nombres, direccion, telefono, carrera, departamento);
                        break;
                    case 3:
                        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println("-------------CONSULTANDO ESTUDIANTE-------------------");
                        System.out.println("Introduce el No Carnet del estudiante que quieres consultar: ");
                        carnet = sc.next();

                        if (carnet == null) {
                            System.out.println("Datos no encontrados...");
                        } else {
                            System.out.println("============Consultando Datos Estudiante============");
                            System.out.println("No Carnet              :" + estudiante.getCarnet());
                            System.out.println("Apellidos              :" + estudiante.getApellidos());
                            System.out.println("Nombres                :" + estudiante.getNombres());
                            System.out.println("Dirección              :" + estudiante.getDireccion());
                            System.out.println("Teléfono               :" + estudiante.getTelefono());
                            System.out.println("Carrera                :" + estudiante.getCarrera());
                            System.out.println("Departamento           :" + estudiante.getDepartamento());
                        }
                        manteestudiantes.consultarEstudiante(carnet);
                        break;
                    case 4:
                        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                        System.out.println("-------------ELIMINANDO ESTUDIANTE-------------------");
                        System.out.println("Introduce el carnet del contacto que quieres eliminar: ");
                        carnet = sc.next();
                        manteestudiantes.eliminarEstudiante(carnet);
                        System.out.println(" REGISTRO: " + carnet + "¡ ELIMINADO CORRECTAMENTE !");
                        break;
                    case 5:
                        salir = true;
                        System.out.println(">>>========== SALISTE DE MANTENIMIENTO ============>>>");
                        break;
                    default:
                        System.out.println("Tienes que introducir una opción validad ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }

        }

    }
}
