package jdbc;

import java.sql.*;

public class connectionFactory {

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/mvp-os";
    private final String PASSWORD = "admin";
    private final String USER = "root";

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao se conectar ao banco", ex);
        }
    }
}