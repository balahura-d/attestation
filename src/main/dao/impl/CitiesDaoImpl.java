package main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import main.dao.CitiesDao;
import main.objects.City;

public class CitiesDaoImpl implements CitiesDao {

	private static final String SQL_SELECT_CITY_BY_ID = "SELECT idCity,City FROM cities WHERE idCity=?";
	private static final String SQL_INSERT_CITY = "INSERT INTO cities(City) VALUES(?)";
	private static final String SQL_DELETE_CITY = "DELETE FROM cities WHERE idCity=?";
	private static final String SQL_UPDATE_CITY = "UPDATE cities SET City=? WHERE idCity=?";

	public void create(City city) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_CITY);

			preparedStatement.setString(1, city.getCity());
			preparedStatement.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public City read(int id) {
		// TODO Auto-generated method stub
		City city = new City();

		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_SELECT_CITY_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			con.close();
			while (resultSet.next()) {
				city.setIdCity(resultSet.getInt("idCity"));
				city.setCity(resultSet.getString("City"));
			}

		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
		return city;
	}

	public void update(City city) {
		// TODO Auto-generated method stub
		try {
			InitialContext initContext = new InitialContext();
			DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
			Connection con = dataSource.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(SQL_UPDATE_CITY);

			preparedStatement.setString(1, city.getCity());
			preparedStatement.executeUpdate();
			con.close();
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
			PreparedStatement preparedStatement = con.prepareStatement(SQL_DELETE_CITY);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.err.println("SQLException" + e);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
