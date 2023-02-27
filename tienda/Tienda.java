/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Isabel
 */
public class Tienda {
    private String codigo;
    private String precio;

    public Tienda(String codigo, String precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "codigo=" + codigo + ", precio=" + precio + '}';
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
