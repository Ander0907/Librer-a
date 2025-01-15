/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavafx.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class ConexionMysql {
    
    private Connection connection;
    private String user = "root";
    private String password = "12345";
    private String servidor = "localhost";
    private String puerto = "3306";
    private String nombreBD = "libreriaANZBbd2694133";
    
    private String url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + nombreBD + "?serverTimezone=UTC";
    
    private String driver = "com.mysql.jdbc.Driver";
    
    public ConexionMysql() {

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
            
            if (connection != null){
                System.out.println("Conexion realizada correctamente");
            }
        } catch (Exception e) {
            System.err.println("Ocurrio un error en la conexion");
            System.err.println("Mensaje del error: " + e.getMessage());
            System.err.println("detalles del error: ");
            
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }
}
