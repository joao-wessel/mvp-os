package dao;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.connectionFactory;

public class UserDao {

    public User logar(User usuario) throws SQLException {
        Connection conexao;
        PreparedStatement prepare;
        ResultSet result;
        Connection connection = new connectionFactory().getConnection();
        String sql = "select * from users where usuario=? and senha=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, usuario.getUsuario());
        stmt.setString(2, usuario.getSenha());
        result = stmt.executeQuery();

        if (result.next()) {
            usuario.setCargo(result.getString("cargo"));
            usuario.setId(result.getInt("id"));
            return usuario;
        } else {
            return usuario;
        }
    }
}