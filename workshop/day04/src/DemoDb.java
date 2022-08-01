import java.sql.*;

public class DemoDb {
    void getData() {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Class.forName("driver");
            conn = DriverManager.getConnection("xyz");
            prepStmt = conn.prepareStatement("select * from table");
            rs = prepStmt.executeQuery();
            while (rs.next()) {
            }
        } catch (Exception e) {
        } finally {
            try {
                if(rs != null) {
                    rs.close();
                    rs = null;
                    System.gc();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(prepStmt != null) {
                    prepStmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
