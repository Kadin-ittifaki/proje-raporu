
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;





public class Operations {
   
     Connection con=null;
     Statement ata=null;
     PreparedStatement pata=null;
     
     //database bilgileri
     String id= "root";
     String password="";
     String host="localhost";
     String port="3306";
     String db_name="books_library";
     
     public Operations(){
         String url ="jdbc:mysql://"+host+":"+port+"/"+db_name;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection( url,id,password);
             System.out.println("Veri tabanına bağlandınız");
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Driver çalışmadı");
         } catch (SQLException ex) {
             Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Connection çalışamadı");
         }
     }
     public static void main(String[] args) {
        Operations op =new Operations();
              
    }
}

