/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimientoestudiantes;

import javax.persistence.EntityManager;
import persistenciaestudiantes.IvEstudiantes;


/**
 *
 * @author Isabel
 */
public class MantenimeintoEstudiantesJpa {
     
     public int guardarEstudiante(IvEstudiantes estudiantes) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        em.getTransaction().begin();
        try {
            em.persist(estudiantes);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        } finally {
            em.close();
        }
        return flag;
    }

    public IvEstudiantes consultarEstudiante(String carnet) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        IvEstudiantes estudiante = null;
        em.getTransaction().begin();
        try {
            estudiante = em.find(IvEstudiantes.class, carnet);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return estudiante;
    }
    
   public int modificarEstudiante(String carnet, String apellidosEstudiante, String nombresEstudiante, String direccion, String telefono, String carrera, String departamento){
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    IvEstudiantes estudiante=null;
    em.getTransaction().begin();
    int flag = 0;
    try {            
        estudiante = em.find(IvEstudiantes.class, carnet);
        estudiante.setApellidos(apellidosEstudiante);
        estudiante.setNombres(nombresEstudiante);
        estudiante.setDireccion(direccion);
        estudiante.setTelefono(telefono);
        estudiante.setCarrera(carrera);
        estudiante.setDepartamento(departamento);
        em.getTransaction().commit(); 
        flag = 1;
    } catch (Exception e) {
        em.getTransaction().rollback();
        flag = 0;
    } finally {
        em.close();
    }           
    return flag;
    }
    
    public int eliminarEstudiante(String carnet){
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        IvEstudiantes estudiante=null;
        em.getTransaction().begin();
        int flag = 0;
        try {            
            estudiante = em.find(IvEstudiantes.class, carnet);
            em.remove(estudiante);
            em.getTransaction().commit(); 
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback(); 
            flag = 0;
        } finally {
            em.close();
        }          
        
        return flag;
    }
    
    
}
