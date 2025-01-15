/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavafx.dao;

import crudjavafx.conexion.ConexionMysql;
import crudjavafx.modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Usuario
 */
public class TareaDao {

    private ConexionMysql fabricaConexion;
    
    public TareaDao(){
        this.fabricaConexion =new ConexionMysql();
        
    }
    
    public boolean registrar( Tarea tarea){
        try {
            String SQL = "insert into persona (documento, nombre)"
                    + "values (?,?)";
            
           Connection connection = this.fabricaConexion.getConnection();
            
           PreparedStatement sentencia = connection.prepareStatement(SQL);
           
           
           sentencia.setString(1,tarea.getDocumento());
           sentencia.setString(2,tarea.getNombre());
            
           sentencia.executeUpdate();
           sentencia.close();
           
           return true;
           
        } catch (Exception e) {
            
            System.err.println("Ocurrio un error al registrar la persona");
            System.err.println("Mensaje del error: " + e.getMessage());
            System.err.println("detalles del error: ");   
            return false;
        }
        
    }
    
}
