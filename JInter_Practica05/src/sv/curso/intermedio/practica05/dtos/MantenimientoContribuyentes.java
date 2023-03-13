/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica05.dtos;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


/**
 *
 * @author Isabel
 */
public class MantenimientoContribuyentes {

    public MantenimientoContribuyentes() {
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
            System.out.println("Conexion Satisfactoria a la Base de Datos...");
        }catch(Exception ex){
            System.out.println("Conexion a la Base de Datos no se puedo establecer...");
        }
        
        return conn;
    }
    
    public static void main(String[] args) {
        MantenimientoContribuyentes mantenimiento = new MantenimientoContribuyentes();
        mantenimiento.conectarBaseDatos();
       Contribuyentes c = new Contribuyentes();
       
//Insertar datos      
        c.setNoNit("06143010901170");
        c.setNombreContribuyente("Motursa");
        c.setRazonSocial("Servicios de Tecnologia");
        c.setRepresentanteLegal("Armando Hoyos");
        c.setRentaAnual(10000.00);
//        System.out.println("Respuesta: " + mantenimiento.guardarContribuyente(c));
 
//Consultaer datos
        Contribuyentes contribuyentes=mantenimiento.consultarContribuyente("06143010901170");
        if (contribuyentes==null){
            System.out.println("Datos del Contribuyente No Encontrados...");
        } else {
            System.out.println("No Nit              : " + contribuyentes.getNoNit());
            System.out.println("Nombre Contribuyente: " + contribuyentes.getNombreContribuyente());
            System.out.println("Razon Social        : " + contribuyentes.getRazonSocial());
            System.out.println("Representante Legal : " + contribuyentes.getRepresentanteLegal());
            System.out.println("Renta Anual         : " + contribuyentes.getRentaAnual());            
        }  
        
//Modificar datos

        contribuyentes.setNombreContribuyente("Portal Java");

        System.out.println("Respuesta: " + mantenimiento.modificarContribuyente(contribuyentes));
        if (contribuyentes == null) {
            System.out.println("Datos del Contribuyente No Encontrados...");
        } else {
            System.out.println("No Nit              : " + contribuyentes.getNoNit());
            System.out.println("Nombre Contribuyente: " + contribuyentes.getNombreContribuyente());
            System.out.println("Razon Social        : " + contribuyentes.getRazonSocial());
            System.out.println("Representante Legal : " + contribuyentes.getRepresentanteLegal());
            System.out.println("Renta Anual         : " + contribuyentes.getRentaAnual());
        }


//Eliminar datos
//        System.out.println("Respuesta: " + mantenimiento.eliminarContribuyente("06143010901170"));
        
     
           
    } 
    
    //GUARDAR
       public int guardarContribuyente(Contribuyentes contribuyentes) {
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "insert into public.iv_contribuyentes ";
            sSql = sSql + "(no_nit, nombre_contribuyente, razon_social, ";
            sSql = sSql + "representante_legal, renta_anual)";
            sSql = sSql + " VALUES ";
            sSql = sSql + "(?, ?, ?, ?, ?)";
                        
            ps = conn.prepareStatement(sSql);
            ps.setString(1, contribuyentes.getNoNit());
            ps.setString(2, contribuyentes.getNombreContribuyente());
            ps.setString(3, contribuyentes.getRazonSocial());
            ps.setString(4, contribuyentes.getRepresentanteLegal());
            ps.setDouble(5, contribuyentes.getRentaAnual());
            flag = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return flag;
    }
      
    //CONSULTAR   
     public Contribuyentes consultarContribuyente(String noNit){
        Statement stmt = null;
        ResultSet rs = null;        
        Connection conn = conectarBaseDatos();
        
        Contribuyentes contribuyentes = null;
        
        try {
            String sql = "select * from public.iv_contribuyentes where no_nit='" + noNit + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                contribuyentes = new Contribuyentes();
                contribuyentes.setNoNit(rs.getString(1));
                contribuyentes.setNombreContribuyente(rs.getString(2));
                contribuyentes.setRazonSocial(rs.getString(3));
                contribuyentes.setRepresentanteLegal(rs.getString(4));
                contribuyentes.setRentaAnual(rs.getDouble(5));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return contribuyentes;
    }
     
    //MODIFICAR
    public int modificarContribuyente(Contribuyentes contribuyentes) {
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {

            String sSql="";
            sSql = sSql + "update public.iv_contribuyentes ";
            sSql = sSql + "set nombre_contribuyente=?, razon_social=?, ";
            sSql = sSql + "representante_legal=?, renta_anual=? ";
            sSql = sSql + "where no_nit=?";
            
            ps = conn.prepareStatement(sSql);
            ps.setString(1, contribuyentes.getNombreContribuyente()); 
            ps.setString(2, contribuyentes.getRazonSocial());
            ps.setString(3, contribuyentes.getRepresentanteLegal());
            ps.setDouble(4, contribuyentes.getRentaAnual());
            ps.setString(5, contribuyentes.getNoNit());
            
            flag= ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        try {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
        }
        return flag;
    } 
    
    //ELIMINAR
    public int eliminarContribuyente(String noNit){
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try{
        String sSql="";
        sSql = sSql + "delete from public.iv_contribuyentes where no_nit=?";
        
        ps = conn.prepareStatement(sSql);
        ps.setString(1, noNit);
        flag = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            
        } finally{
            try{
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            }catch (SQLException ex){
                
            }
           
        }
        return flag;
    }
   
       
       
}
    
    
    
    

