package main.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import main.dao.CitiesDao;
import main.objects.City;

public class CitiesDaoImpl implements CitiesDao {

	public void create(City obj) {
		// TODO Auto-generated method stub
		
	}

	public City read(int id) {
		// TODO Auto-generated method stub
		List<City> cities = new ArrayList<>();
		try  { InitialContext initContext = new InitialContext(); 
				 DataSource dataSource = (DataSource) initContext.lookup("java:comp/env/connpool");
				 Connection con1 = dataSource.getConnection();
		           
			
		}catch (Exception e) {
            System.err.println(e);
        }
		return null;
	}

	public void update(City obj) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
