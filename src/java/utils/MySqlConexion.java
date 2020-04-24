/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// clase donde se realiza la conexion con la base de datos 

public class MySqlConexion {
   public static Connection getConection(){
       Connection con = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/eva";
           String usr = "root";
           String psw = "";
           con = DriverManager.getConnection( url , usr , psw);
           
       }
       catch(ClassNotFoundException e ){
           System.out.println("Error >> Driver no instalado");
           
       } catch(SQLException e){
           System.out.println("Error >> de conexion con la DB");
           
       }
       return con;
   } 
}
