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
import Vista.Parqueadero;
public class VehiculoServicios {
    
   public Integer m,n;
   public String m1,n1,o; 
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
    
     public void sumar(Connection conexion, Vehiculo d)throws SQLException{
       Parqueadero v = new Parqueadero();
         
        try{
            
           Statement sta = conexion.createStatement();
           String consulta = "select sum(valor) as total, count(placa) as cantidad, tipo from registro group by tipo";
           ResultSet rs = sta.executeQuery(consulta);
         //  while(rs.next()){
           rs.next();
            m = rs.getInt("cantidad");
            
       
           //  v.txtCarros.setText(String.valueOf(m));
          m1 = String.valueOf(m);
             rs.next();
             n = rs.getInt("cantidad");
        //     System.out.println("Total valor = "+n);
         //    v.txtMotos.setText(String.valueOf(n));
            n1 = String.valueOf(n);
          o=m1+n1;  
        //   }
            System.out.println("Total valor = "+o);
           rs.close();
           sta.close();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    
    }
    
    
}
