/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionPack;
import java.sql.*;


/**
 *
 * @author Raj
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        
        try{
            Class.forName("java.sql.DriverManager");
            Connection con;
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            return con;
        }
        catch (Exception ex) {
            System.out.println("hello there");
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
}
