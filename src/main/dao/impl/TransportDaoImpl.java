package main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import main.dao.TransportDao;
import main.objects.Transport;

public class TransportDaoImpl implements TransportDao {

	public void create(Transport obj) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_CLIENT);

			
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public Transport read(int id) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_CLIENT);

			
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

	public void update(Transport obj) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_CLIENT);

			
			
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
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_CLIENT);

			
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
