/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coneccionbd;

/**
 *
 * @author JOSE
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConeccionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            String usuario = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/bymarjorisgarces";
            
            Connection conexion;
            Statement statement;
            ResultSet rs;
            
            try {
                // TODO code application logic here
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
            
            catch (ClassNotFoundException ex) {
                Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            rs = statement.executeQuery("SELECT * FROM administrador");
            rs.next();
            do{
                System.out.println("primera lista "+rs.getString("Idadministrador")+ ":"+rs.getString("contraseña"));
            }while(rs.next());
            
            statement.executeUpdate("INSERT INTO administrador(Idadministrador,contraseña) values ('admin2','ABC321')");
            statement.executeUpdate("UPDATE `administrador` SET `Idadministrador` = 'admin0' WHERE `administrador`.`Idadministrador` = 'admin1'");
            statement.executeUpdate("DELETE FROM `administrador` WHERE `administrador`.`Idadministrador` = 'admin3'");
            rs = statement.executeQuery("SELECT * FROM administrador");
            rs.next();
            
            do{
                System.out.println("lista editada "+rs.getString("Idadministrador")+ ":"+rs.getString("contraseña"));
            }while(rs.next());
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
