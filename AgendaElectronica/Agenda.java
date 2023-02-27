/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaElectronica;

/**
 *
 * @author Isabel
 */
public class Agenda {
    private String noDui;
    private String telefono;
    private String nombre;
    private Float salario;

    public Agenda(String noDui, String telefono, String nombre, Float salario) {
        this.noDui = noDui;
        this.telefono = telefono;
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "\n noDui:"    + noDui    + "\n" + 
                "telefono:" + telefono + "\n" + 
                "nombre:"   + nombre   + "\n" +
                "salario:"  + salario ;
    }

   
    public String getNoDui() {
        return noDui;
    }

    public void setNoDui(String noDui) {
        this.noDui = noDui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    
   
}
