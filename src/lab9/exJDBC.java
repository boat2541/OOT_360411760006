package lab9;

import java.sql.*;

public class exJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        //step1
        Class.forName("org.sqlite.JDBC");

        //step2
        String SQCONN = "jdbc:sqlite:test.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null){
                System.out.println("Could not connection to Database.");

            }else {
                System.out.println("Connection to Database.");
            }
            //step3
            Statement stmt = conn.createStatement();
            String sql = "select * from user";
            ResultSet rs = stmt.executeQuery(sql);

            //step4
            while (rs.next()){
                System.out.println("ID: "+rs.getString(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Addrees: "+rs.getString(3));
                System.out.println("tel.: "+rs.getString(4));
                System.out.println("--------------------------------");

            }
            //step5
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }




















    }
}
