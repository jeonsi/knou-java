import java.sql.*;

public class DatabaseMetaDataTest {
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/mydb";
            String user = "";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);

            DatabaseMetaData dbmd = conn.getMetaData();     // Database Metadata 정보보 획득
            System.out.println(dbmd.getDriverName());
            System.out.println(dbmd.getURL());
            System.out.println(dbmd.getUserName());
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException ex) {}
        }
    }
}
