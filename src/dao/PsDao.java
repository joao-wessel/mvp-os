package dao;

import entities.Ps;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import jdbc.connectionFactory;

public class PsDao {

    private Connection conexao;
    private PreparedStatement prepare;

    public List<Ps> read() throws SQLException {
        Connection connection = new connectionFactory().getConnection();

        String query = "select * from ps";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        Vector<Ps> psList = new Vector<Ps>();

        while (rs.next()) {
            Ps ps = new Ps(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("cep"), rs.getString("rua"), rs.getInt("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"));
            psList.add(ps);
        }

        stmt.execute();
        stmt.close();
        connection.close();
        return psList;
    }

    public void create(Ps ps) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "insert into ps(nome,cpf,telefone,cep,rua,numero,bairro,cidade,estado)values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, ps.getNome());
        stmt.setString(2, ps.getCpf());
        stmt.setString(3, ps.getTelefone());
        stmt.setString(4, ps.getCep());
        stmt.setString(5, ps.getRua());
        stmt.setInt(6, ps.getNumero());
        stmt.setString(7, ps.getBairro());
        stmt.setString(8, ps.getCidade());
        stmt.setString(9, ps.getEstado());

        stmt.execute();
        stmt.close();
        connection.close();
    }

    public void change(Ps ps) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "update ps set nome=?,cpf=?,telefone=?,cep=?,rua=?,numero=?,bairro=?,cidade=?,estado=?" + "where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, ps.getNome());
        stmt.setString(2, ps.getCpf());
        stmt.setString(3, ps.getTelefone());
        stmt.setString(4, ps.getCep());
        stmt.setString(5, ps.getRua());
        stmt.setInt(6, ps.getNumero());
        stmt.setString(7, ps.getBairro());
        stmt.setString(8, ps.getCidade());
        stmt.setString(9, ps.getEstado());

        stmt.execute();
        stmt.close();
        connection.close();
    }

    public void remove(int id) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "delete from ps where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public List<Ps> searchByName(String nome) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "select * from ps where nome like ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Ps> psList = new ArrayList<>();

        while (rs.next()) {
            Ps psrvc = new Ps(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("cep"), rs.getString("rua"), rs.getInt("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"));
            psList.add(psrvc);
        }

        ps.execute();
        ps.close();
        connection.close();
        return psList;
    }
}