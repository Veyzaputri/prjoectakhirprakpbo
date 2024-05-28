import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connector {
    Connection con;
    Statement stm;

    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tokobuku", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}