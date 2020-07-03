/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author javil
 */
public class Conexion {
       Connection con;
    public Conexion(){
        try {
         Class.forName("com.mysql.jdbc.Driver");
         con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/Evaluacion2","root","");
        } catch (Exception e) {
           System.err.print("Error" +e);
           
        }
    }
    public static void main(String[] args) {
        Conexion cn=new Conexion();
    }
}
