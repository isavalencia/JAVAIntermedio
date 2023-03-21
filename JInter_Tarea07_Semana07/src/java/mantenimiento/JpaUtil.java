/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Isabel
 */
public class JpaUtil {
    private static final EntityManagerFactory emf;
    static{
        try{
            emf = Persistence.createEntityManagerFactory("JInter_Tarea07_Semana07PU");
        }catch(Throwable ex){
            System.out.println("Initial SessionFactory creation failed." + ex);
            
         throw new ExceptionInInitializerError(ex);
        }
    }
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
        
    }
    
}
