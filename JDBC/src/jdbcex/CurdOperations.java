package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CurdOperations {
    static Connection con;
    static PreparedStatement pst;

    static {
        con = DBUtil.getConnection();
        if (con != null) {
            System.out.println("Connection is successful");
        } else {
            System.out.println("Connection failed");
        }
    }

    // Add a student to the table
    public static int addStudent(int sid, String sname) {
        int n = 0;
        try {
            pst = con.prepareStatement("INSERT INTO student VALUES(?, ?)");
            pst.setInt(1, sid);
            pst.setString(2, sname);
            n = pst.executeUpdate(); // n will contain number of rows inserted
            System.out.println("Student added successfully: ID=" + sid + ", Name=" + sname);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close(); // close PreparedStatement
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return n;
    }
}
