import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoDb {
    void getData() throws Exception {
        // Load driver class
        Class.forName("driver");
        // Create connection to db
        Connection conn
                = DriverManager.getConnection("xyz");
        // SQL Statement
        PreparedStatement prepStmt
                = conn.prepareStatement("select * from table");
        // Get data
        ResultSet rs = prepStmt.executeQuery();
        while (rs.next()) {

        }
        // Close resources
        rs.close();
        prepStmt.close();
        conn.close();
    }
}
