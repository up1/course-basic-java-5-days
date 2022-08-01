import java.sql.*;

public class DemoDb2 {
    void getData() {
        // Try-resources
        try (
                Connection conn = DriverManager.getConnection("xyz");
                PreparedStatement prepStmt = conn.prepareStatement("select * from table");
                ResultSet rs = prepStmt.executeQuery();
        ) {
            while (rs.next()) {
            }
        } catch (Exception e) {
        }
    }
}
