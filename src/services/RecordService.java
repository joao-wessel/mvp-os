package services;

import dao.ClientDao;
import dao.OsDao;
import dao.PsDao;
import dao.UserDao;
import entities.Ps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import jdbc.connectionFactory;

public class RecordService {

    private Connection conexao;
    private PreparedStatement prepare;
    private ClientDao clientDao;
    private PsDao psDao;
    private UserDao userDao;
    private OsDao osDao;

    public RecordService() {
        this.clientDao = new ClientDao();
        this.psDao = new PsDao();
        this.osDao = new OsDao();
        this.userDao = new UserDao();
    }

    public int clientsTotal() throws SQLException {
        return this.clientDao.read().size();
    }

    public int osTotal() throws SQLException {
        return this.osDao.read().size();
    }

    public double avgOs() throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String query = "select avg(amount) as 'avg' from os";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        double media = 0;

        while (rs.next()) {
            media = rs.getDouble("avg");
        }

        stmt.execute();
        stmt.close();
        connection.close();
        return media;
    }

    public double sumOs() throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String query = "select sum(amount) as 'sum' from os;";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        double soma = 0;

        while (rs.next()) {
            soma = rs.getDouble("sum");
        }

        stmt.execute();
        stmt.close();
        connection.close();
        return soma;
    }

    public double biggestOs() throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String query = "select max(amount) as 'biggest' from os";
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        double maior = 0;

        while (rs.next()) {
            maior = rs.getDouble("biggest");
        }

        stmt.execute();
        stmt.close();
        connection.close();
        return maior;
    }

    public Ps bestPs() throws SQLException {
        Connection connection = new connectionFactory().getConnection();
        String query = "select * from ps where id = (select ps_id from os  group by ps_id order by count(ps_id) desc limit 1)";
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
        return psList.get(0);
    }
}