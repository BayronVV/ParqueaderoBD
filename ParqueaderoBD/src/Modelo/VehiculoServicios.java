/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author auxiliar
 */
import java.sql.*;
public class VehiculoServicios {
    
    public void guardar(Connection conexion, Vehiculo d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("INSERT INTO registro (placa, fecha, modelo, tipo, valor)"+"VALUES(?,?,?,?,?)");
           consulta.setString(1, d.getPlaca());
           consulta.setDate(2, d.getFecha());
           consulta.setInt(3, d.getModelo());
           consulta.setString(4, d.getTipo());
           consulta.setInt(5, d.getValor());
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }
    public void eliminarTodo(Connection conexion, Vehiculo d)throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("DELETE FROM registro");
          
       
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    
    }
    
}
