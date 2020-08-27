package JDBCDemo;

import java.sql.*;

public class JDBCDMLDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1. loading a driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String user ="root";
        String pass ="root";
        String url = "jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. creating a statemement

        Statement st = con.createStatement();


        // 4. executing query

        String sql = "insert into  student values(3,'Anil','IT',77)";
//        String sql = "update student set name='Abhishek' where id=2";
      //  String sql = "delete from student where id=2";

        st.executeUpdate(sql);


    }
}
