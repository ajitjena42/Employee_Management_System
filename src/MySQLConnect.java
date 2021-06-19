
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIYUSH
 */
public class MySQLConnect {
    
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/employee_management";
    private static final String USERNAME ="root";
    private static final String PASSWORD = "";
    
    
    /**
     * @return
     * Returns a valid connection to employee mgmt DB if it can,otherwise it returns null
     */
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(CONNECTION_STRING,USERNAME,PASSWORD);
           // JOptionPane.showMessageDialog(null,"Conncetion Established");
        }
        catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null,"Conncetion Failed :"+ ex.getMessage());
        }
        return conn;
        
    }
    public static void main(String args[]){
        Connection con = getConnection();
    }
}

