package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/user";
    private static final String USER = "root";
    private static final String PASSWORD = "rukibazuki";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Ошибка при подключении к базе данных:");
            throw new RuntimeException(e);
        }
        return connection;
    }
}

