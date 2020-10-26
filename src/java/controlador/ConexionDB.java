/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author JoseMiguel
 */
public class ConexionDB {
    
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebawposs","root","");
         System.out.println("Éxito al conectar");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No Soportado");
    }
    
}
