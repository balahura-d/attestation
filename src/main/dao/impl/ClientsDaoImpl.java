package main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import main.dao.ClientsDao;
import main.objects.Client;

public class ClientsDaoImpl implements ClientsDao {

	private static final String SQL_INSERT_CLIENT = "INSERT INTO clients(firstName,secondName,email,passHash,idRole) VALUES(?,?,?,?,?)";
	private static final String SQL_SELECT_CLIENT_BY_ID = "SELECT idClient,firstName,secondName,email,passHash,idRole FROM clients WHERE idClients=?";
	private static final String SQL_UPDATE_CLIENT = "UPDATE clients SET firstName=?,secondName=?,email=?,passHash=?,idRole=? WHERE idClients=?";
	private static final String SQL_DELETE_CLIENT = "DELETE FROM clients WHERE idClients=?";

	public void create(Client client) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_CLIENT);

			preparedStatement.setString(1, client.getFirstName());
			preparedStatement.setString(2, client.getSecondName());
			preparedStatement.setString(3, client.getEmail());
			preparedStatement.setLong(4, client.getPassHash());
			preparedStatement.setInt(5, client.getIdRole());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public Client read(int id) {
		// TODO Auto-generated method stub
		Client client = new Client();
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_SELECT_CLIENT_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			con.close();
			while (resultSet.next()) {
				client.setIdClient(resultSet.getInt("idClient"));
				client.setFirstName(resultSet.getString("firstName"));
				client.setSecondName(resultSet.getString("secondName"));
				client.setEmail(resultSet.getString("email"));
				client.setPassHash(resultSet.getLong("passHash"));
				client.setIdRole(resultSet.getInt("idRole"));
			}
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
		return client;
	}

	public void update(Client client) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_UPDATE_CLIENT);
			preparedStatement.setString(1, client.getFirstName());
			preparedStatement.setString(2, client.getSecondName());
			preparedStatement.setString(3, client.getEmail());
			preparedStatement.setLong(4, client.getPassHash());
			preparedStatement.setInt(5, client.getIdRole());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_DELETE_CLIENT);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
