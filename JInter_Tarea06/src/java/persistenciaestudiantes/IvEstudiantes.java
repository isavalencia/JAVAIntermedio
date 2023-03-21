/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaestudiantes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Isabel
 */
@Entity
@Table(name = "iv_estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IvEstudiantes.findAll", query = "SELECT i FROM IvEstudiantes i"),
    @NamedQuery(name = "IvEstudiantes.findByCarnet", query = "SELECT i FROM IvEstudiantes i WHERE i.carnet = :carnet"),
    @NamedQuery(name = "IvEstudiantes.findByApellidos", query = "SELECT i FROM IvEstudiantes i WHERE i.apellidos = :apellidos"),
    @NamedQuery(name = "IvEstudiantes.findByNombres", query = "SELECT i FROM IvEstudiantes i WHERE i.nombres = :nombres"),
    @NamedQuery(name = "IvEstudiantes.findByDireccion", query = "SELECT i FROM IvEstudiantes i WHERE i.direccion = :direccion"),
    @NamedQuery(name = "IvEstudiantes.findByTelefono", query = "SELECT i FROM IvEstudiantes i WHERE i.telefono = :telefono"),
    @NamedQuery(name = "IvEstudiantes.findByCarrera", query = "SELECT i FROM IvEstudiantes i WHERE i.carrera = :carrera"),
    @NamedQuery(name = "IvEstudiantes.findByDepartamento", query = "SELECT i FROM IvEstudiantes i WHERE i.departamento = :departamento")})
public class IvEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "carnet")
    private String carnet;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "carrera")
    private String carrera;
    @Column(name = "departamento")
    private String departamento;

    public IvEstudiantes() {
    }

    public IvEstudiantes(String carnet) {
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carnet != null ? carnet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IvEstudiantes)) {
            return false;
        }
        IvEstudiantes other = (IvEstudiantes) object;
        if ((this.carnet == null && other.carnet != null) || (this.carnet != null && !this.carnet.equals(other.carnet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaestudiantes.IvEstudiantes[ carnet=" + carnet + " ]";
    }
    
}
