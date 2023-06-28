package com.mouni.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCImplementation 
{
	public static void main(String[] args) 
	{
		try 
		{
		  Driver driver = new Driver();
		  DriverManager.registerDriver(driver);
		  String url = "jdbc:mysql://localhost:3306/my_info"+"?user=root&password=root";
		  Connection connection = DriverManager.getConnection(url);
		  Statement statement = connection.createStatement();
		  String query = "insert into details(id,Name,adress)"+"values"+"('101','Mouni','PUNGANUR')";
		  statement.execute(query);
		  statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
