
package railway_reservation;

import java.sql.*;

public class Railway_Reservation {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.jdbc.Driver");  
    Connection conn;  
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_res","root","");
    Login log;
        log = new Login();
        new Login().setVisible(true);
       
        
    }
    
}
