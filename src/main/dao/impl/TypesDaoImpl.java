package main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import main.dao.TypesDao;
import main.objects.Types;

public class TypesDaoImpl implements TypesDao{

	public void create(Types obj) {
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

	public Types read(int id) {
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

	public void update(Types obj) {
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
