package dao;

import entities.Client;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import jdbc.connectionFactory;

public class ClientDao {

    private Connection conexao;
    private PreparedStatement prepare;

    public List<Client> read() throws SQLException {
        Connection connection = new connectionFactory().getConnection();

        String query = "select * from clients";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        Vector<Client> clientes = new Vector<Client>();

        while (rs.next()) {
            Client cliente = new Client(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("cep"), rs.getString("rua"), rs.getInt("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"));
            clientes.add(cliente);
        }

        stmt.execute();
        stmt.close();
        connection.close();
        return clientes;

    }

    public void create(Client cliente) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "insert into clients(nome,cpf,telefone,cep,rua,numero,bairro,cidade,estado)values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getCep());
        stmt.setString(5, cliente.getRua());
        stmt.setInt(6, cliente.getNumero());
        stmt.setString(7, cliente.getBairro());
        stmt.setString(8, cliente.getCidade());
        stmt.setString(9, cliente.getEstado());

        stmt.execute();
        stmt.close();
        connection.close();
    }

    public void change(Client cliente) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "update clients set nome=?,cpf=?,telefone=?,cep=?,rua=?,numero=?,bairro=?,cidade=?,estado=? where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getCep());
        stmt.setString(5, cliente.getRua());
        stmt.setInt(6, cliente.getNumero());
        stmt.setString(7, cliente.getBairro());
        stmt.setString(8, cliente.getCidade());
        stmt.setString(9, cliente.getEstado());
        stmt.setInt(10, cliente.getId());

        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public void remove(int id) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "delete from clients where id=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public List<Client> searchByName(String nome) throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String sql = "select * from clients where nome like ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Client> clients = new ArrayList<>();

        while (rs.next()) {
            Client client = new Client(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("cep"), rs.getString("rua"), rs.getInt("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"));
            clients.add(client);
        }

        ps.execute();
        ps.close();
        connection.close();
        return clients;
    }
}