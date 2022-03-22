
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class BeanEmpleado implements Serializable {
    String id;
    String nombre;
    String rol;
    public BeanEmpleado(){
        
    }
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
}
