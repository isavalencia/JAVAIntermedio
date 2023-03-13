/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimientorenta;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class Conexion {

    public Conexion() {
      cargarDriver();
    }
    
    
    
   public void cargarDriver(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Cargado Satisfactoriamente...");
        }catch(Exception e){
            System.out.println("Driver No pudo ser Cargado...");
        }
    }
    
    //CONEXION A LA BD
    public Connection conectarBaseDatos(){
        String url = "jdbc:postgresql://proyectos.coehxub0jkfc.us-east-2.rds.amazonaws.com:5432/proyectos";
        String usuario = "Edutech";
        String password = "practicaEdu";        
        Connection conn=null;
        try{ 
            
           conn = DriverManager.getConnection(url, usuario, password);
            JOptionPane.showMessageDialog(null,"Conexion Satisfactoria a la Base de Datos...","Conexión Establecida", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            System.out.println("Conexion a la Base de Datos no se puedo establecer...");
        }
        
        return conn;
    }
    
}
