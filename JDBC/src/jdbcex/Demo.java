package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) throws Exception {

        String URL = "jdbc:mysql://localhost:3306/teegala";
        String USER = "root";
        String PASSWORD = "root";

        // Step-1: Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("The Driver is loaded successfully");

        // Step-2: Establishing the connection
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connection Established");

        // Step-3: Statement creation
        Statement st = con.createStatement();

        // Step-4: Execute a query
        st.executeUpdate("CREATE TABLE IF NOT EXISTS student (sid INT, sname VARCHAR(20))");
        System.out.println("Table created");

        // Step-5: Close resources
        st.close();
        con.close();
    }
}
