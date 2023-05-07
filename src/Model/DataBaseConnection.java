package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static String email_connected = "maryuscostescu558@yahoo.com";
    public static Connection database_connection() throws SQLException {
        System.out.println("Connecting database...");
        String url = "jdbc:mysql://localhost:3306/mmsairline", username = "root", password = "16092001";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;

        /*try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");


            //statement.executeUpdate("DELETE FROM user ");
            statement.close();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }*/
    }
}
