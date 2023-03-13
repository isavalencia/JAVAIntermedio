/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jinter_tarea5_semana5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;

/**
 *
 * @author Isabel
 */
public class MantenimientoEmpleados extends Conecta{
    
     //GUARDAR
    public void guardarEmpleados(JTextField nonit, JTextField nombre, JTextField direccion, JTextField telefono, JTextField salariomensual, JTextField descrenta) {
        
        Empleados emp = new Empleados();
        emp.setNonit(nonit.getText());
        emp.setNombre(nombre.getText());
        emp.setDireccion(direccion.getText());
        emp.setTelefono(telefono.getText());
        emp.setSalariomensual(Double.parseDouble(salariomensual.getText()));
        emp.setDescuentorenta(Double.parseDouble(descrenta.getText()));
//        int flag = 0;
//        PreparedStatement ps = null;
        Conecta conn = new Conecta();
        //Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "insert into public.iv_motursa ";
            sSql = sSql + "(no_nit, nombre, direccion, ";
            sSql = sSql + "telefono, salario_mensual,";
            sSql = sSql + "descuento_renta )";
            sSql = sSql + " VALUES ";
            sSql = sSql + "(?, ?, ?, ?, ?, ?)";
                         
            CallableStatement cs = conn.conectarBaseDatos().prepareCall(sSql);
            
            cs.setString(1, emp.getNonit());
            cs.setString(2, emp.getNombre());
            cs.setString(3, emp.getDireccion());
            cs.setString(4, emp.getTelefono());
            cs.setDouble(5, emp.getSalariomensual());
            cs.setDouble(6, emp.getDescuentorenta());
            
            cs.execute();
           
           
        JOptionPane.showMessageDialog(null, "El registro se guardo correctamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente" + e,"Mensaje", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        
        }
    }
    
    //MOSTRAR
    public void mostrarEmpleados (JTable tablaEmpleados){
        Statement stmt = null;
        ResultSet rs = null;        
        Connection conn = conectarBaseDatos();
//         Empleados empleados = null;
         
         DefaultTableModel modelo = new DefaultTableModel();
         
         //String sql="";
         
         modelo.addColumn("NO NIT");
         modelo.addColumn("NOMBRE");
         modelo.addColumn("DIRECCIÓN");
         modelo.addColumn("TELÉFONO");
         modelo.addColumn("SALARIO MENSUAL");
         modelo.addColumn("DESCUENTO RENTA");
         
         tablaEmpleados.setModel(modelo);
         
         String [] datosEmpleados = new String[6];
         
          
         try {
            String sql ="select * from public.iv_motursa";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                
                datosEmpleados[0] = rs.getString(1);
                datosEmpleados[1] = rs.getString(2);
                datosEmpleados[2] = rs.getString(3);
                datosEmpleados[3] = rs.getString(4);
                datosEmpleados[4] = rs.getString(5);
                datosEmpleados[5] = rs.getString(6);
                
                modelo.addRow(datosEmpleados);   
            }
            tablaEmpleados.setModel(modelo);
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
       
    }
    
    //SELECCIONAR
     public void seleccionarEmpleado(JTable tablaEmpleados ,JTextField nonit,JTextField nombre, JTextField direccion, JTextField telefono, JTextField salariomensual,JTextField descrenta){
        
         try {
            int fila = tablaEmpleados.getSelectedRow();
            if(fila >=0){
                nonit.setText(tablaEmpleados.getValueAt(fila, 0).toString());
                nombre.setText(tablaEmpleados.getValueAt(fila, 1).toString());
                direccion.setText(tablaEmpleados.getValueAt(fila, 2).toString());
                telefono.setText(tablaEmpleados.getValueAt(fila, 3).toString());
                salariomensual.setText(tablaEmpleados.getValueAt(fila, 4).toString());
                descrenta.setText(tablaEmpleados.getValueAt(fila, 5).toString());
            }else{
                JOptionPane.showMessageDialog(null, "fila no seleccionada");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
     
    
    //MODIFICAR 
     public void modificarEmpleado( JTextField nonit,JTextField nombre, JTextField direccion,  JTextField telefono,  JTextField  salariomensual, JTextField descrenta) {
        Empleados empleados = new Empleados();
        empleados.setNonit(nonit.getText());
        empleados.setNombre(nombre.getText());
        empleados.setDireccion(direccion.getText());
        empleados.setTelefono(telefono.getText());
        empleados.setSalariomensual(Double.parseDouble(salariomensual.getText()));
        empleados.setDescuentorenta(Double.parseDouble(descrenta.getText()));
        
//        int flag = 0;
//        PreparedStatement ps = null;
          Conecta conn = new Conecta();
//        Connection conn = conectarBaseDatos();
        try {

            String sSql="";
            sSql = sSql + "update public.iv_motursa ";
            sSql = sSql + "set nombre=?, direccion=?, ";
            sSql = sSql + "telefono=?, salario_mensual=?, descuento_renta=? ";
            sSql = sSql + "where no_nit=?";
            
            CallableStatement cs = conn.conectarBaseDatos().prepareCall(sSql);
            
            
            cs.setString(1, empleados.getNombre());
            cs.setString(2, empleados.getDireccion());
            cs.setString(3, empleados.getTelefono());
            cs.setDouble(4, empleados.getSalariomensual());
            cs.setDouble(5, empleados.getDescuentorenta());
            cs.setString(6, empleados.getNonit());
            
          cs.execute();
           
           
        JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se actualizo correctamente" + e,"Mensaje", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        
        }
    }
     
    //ELIMINAR 
     public void eliminarEmpleado( JTextField nonit) {
        Empleados emp = new Empleados();
        emp.setNonit(nonit.getText());
        
        
//        int flag = 0;
//        PreparedStatement ps = null;
          Conecta conn = new Conecta();
//        Connection conn = conectarBaseDatos();
        try {

            String sSql="";
            sSql = sSql + "delete from public.iv_motursa ";
            sSql = sSql + "where no_nit=?";
            
            CallableStatement cs = conn.conectarBaseDatos().prepareCall(sSql);
           
            cs.setString(1, emp.getNonit());
            
          cs.execute();
           
           
        JOptionPane.showMessageDialog(null, "El registro se elimino correctamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se elimino correctamente" + e,"Mensaje", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        
        }
    }
    
    
}
