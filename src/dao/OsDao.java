package dao;

import entities.Os;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import jdbc.connectionFactory;

public class OsDao {

    private Connection conexao;
    private PreparedStatement prepare;

    public List<Os> read() throws SQLException {
        Connection connection = new connectionFactory().getConnection();

        String query = "select * from os";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        Vector<Os> osList = new Vector<Os>();

        while (rs.next()) {
            Os os = new Os(rs.getInt("id"), rs.getString("number"), rs.getInt("user_id"), rs.getString("date"), rs.getDouble("amount"), rs.getInt("client_id"), rs.getInt("ps_id"), rs.getString("descricao"));
            osList.add(os);
        }

        stmt.execute();
        stmt.close();
        connection.close();
        return osList;
    }

    public void create(Os os) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "insert into os(number,user_id,date,amount,client_id,ps_id,descricao)values(?,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, os.getNumber());
        stmt.setInt(2, os.getUser_id());
        stmt.setString(3, os.getDate());
        stmt.setDouble(4, os.getAmount());
        stmt.setInt(5, os.getClient_id());
        stmt.setInt(6, os.getPs_id());
        stmt.setString(7, os.getDescricao());

        stmt.execute();
        stmt.close();
        connection.close();
    }

    public void change(Os os) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "update os set number=?,user_id=?,date=?,amount=?,client_id=?,ps_id=?,descricao=?" + "where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, os.getNumber());
        stmt.setInt(2, os.getUser_id());
        stmt.setString(3, os.getDate());
        stmt.setDouble(4, os.getAmount());
        stmt.setInt(5, os.getClient_id());
        stmt.setInt(6, os.getPs_id());
        stmt.setString(7, os.getDescricao());

        stmt.execute();
        stmt.close();
        connection.close();
    }

    public void remove(int id) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "delete from os where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public List<Os> searchByName(String nome) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "select * from os where nome like ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Os> osList = new ArrayList<>();

        while (rs.next()) {
            Os os = new Os(rs.getInt("id"), rs.getString("number"), rs.getInt("user_id"), rs.getString("date"), rs.getDouble("amount"), rs.getInt("client_id"), rs.getInt("ps_id"), rs.getString("descricao"));
            osList.add(os);
        }

        ps.execute();
        ps.close();
        connection.close();
        return osList;
    }
}