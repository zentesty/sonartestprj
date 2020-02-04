package db;

import java.sql.*;

public class DBAccess {


    public static void main(String[] args) throws ClassNotFoundException {
        String dbURL = "jdbc:mysql://localhost:3306/DJD_SonarQ";
        String user = "root";
        String password = "monitor";


        Class.forName("com.mysql.jdbc.Driver");

        try {

            Connection conn = DriverManager.getConnection(dbURL, user, password);

            CallableStatement statement = conn.prepareCall("SELECT * FROM User");

            statement.execute();
            ResultSet rs = statement.getResultSet();
            statement.close();

            System.out.println("Stored procedure called successfully!");


        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
