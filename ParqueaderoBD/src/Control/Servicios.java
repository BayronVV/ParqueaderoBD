/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author auxiliar
 */
import Modelo.*;
import Servicios.Conexion;
public class Servicios {
    
    
    public void RegistrarV(Vehiculo v){
        
         try{
        
            VehiculoServicios vs = new VehiculoServicios();
            vs.guardar(Conexion.obtener(), v);
        }
        catch(Exception e){
        
        }
    
    }
    public void EliminarD(Vehiculo d){
    
        try{
        
            VehiculoServicios ds = new VehiculoServicios();
            ds.eliminarTodo(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
}
