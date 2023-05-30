import java.sql.*;      // to use JDBC API

public class JDBCTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // int resultCount = 0;
        try {
            /* Loading class 'com.mysql.jdbc.Driver'. This is deprecated.
            * The new driver class is 'com.mysql.cj.jdbc.Driver'.
            * The driver is automatically registered via the SPI and maunal loading of the driver class is generally unnecessary.
            */
            // 아래 드라이버 동적로딩 호출은 생략 가능
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://localhost/mydb";
            String user = "";
            String pass = "";
            // DBMS와 연결 및 connection 객체 생성
            conn = DriverManager.getConnection(url, user, pass);

            // statement 객체 생성
            // 1회성 SQL문 실행, SQL 문은 execute(QUERY) 호출 시 전달
            stmt = conn.createStatement();

            // resultset 객체 생성
            // .execute(SELECT) : true이면, getResultSet() 호출
            // .execute(INSERT/UPDATE/DELETE) : false이면, getUpdateCount() 호출
            // .executeQuery(SELCT) : resultset 리턴
            // .executeUpdate(INSERT/UPDATE/DELETE) : count 리턴
            rs = stmt.executeQuery("SELECT * FROM 고객");   // READ
            System.out.println("고객번호\t고객아이디\t전화번호\t주소");
            while (rs.next()) {
                System.out.print(rs.getInt("고객번호") + "\t\t");
                System.out.print(rs.getString("고객아이디") + "\t\t");
                System.out.print(rs.getString("전화번호") + "\t");
                System.out.println(rs.getString("주소") + "\t");
            }
            rs.close();

            // prepared statement 방식
            // 인자전달 및 반복성 SQL문 실행
            String query = "select * from 고객 where 고객번호 > ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, 3);  // 1번째 ?에, 3 할당
            // execute() 호출 시에 매개 변수가 없음
            rs = ps.executeQuery();
            // resultset metadata 사용
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getTableName(1));   // 1번 컬럼을 포함하는 테이블의 이름 반환
            int colCount = rsmd.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    switch (rsmd.getColumnType(i)) {
                        case Types.INTEGER:
                            System.out.print(rs.getInt(i) + "\t\t");
                            break;
                        case Types.VARCHAR:
                            System.out.print(rs.getString(i) + "\t\t");
                            break;
                    }
                }
                System.out.println();
            }
            rs.close();

            // resultCount = stmt.executeUpdate("insert into ...");         // CREATE
            // System.out.println(resultCount + "개의 행이 삽입되었습니다.");
            // resultCount = stmt.executeUpdate("update book set ...");     // UPDATE
            // System.out.println(resultCount + "개의 행이 변경되었습니다.");
            // resultCount = stmt.executeUpdate("delete from book ...");    // DELETE
            // System.out.println(resultCount + "개의 행의 삭제되었습니다.");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {     // 자원반납
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {}
        }
    }
}
