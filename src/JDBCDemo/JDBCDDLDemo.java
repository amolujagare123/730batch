package JDBCDemo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.*;

public class JDBCDDLDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        String user ="root";
        String pass ="root";
        String url ="jdbc:mysql://localhost:3306/ganesh";

        Connection con  = DriverManager.getConnection(url,user,pass);

        Statement st = con.createStatement();

        String sql = "select id,name from student"; // DDL query - data definition language query

        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
        /*  System.out.print(rs.getString("branch")+" ");
            System.out.print(rs.getInt("marks"+" "));*/
            System.out.println();
        }


    }

}
