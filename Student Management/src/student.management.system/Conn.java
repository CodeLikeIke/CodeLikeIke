package Student.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///studentmanagementsystem", "root", "codeforinterview");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}