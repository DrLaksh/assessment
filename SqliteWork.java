package net.mulesoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String jdbcurl = "jdbc:sqlite:/\"C:\\Users\\laksh\\Desktop\\db\\movies.db";
    try {
      Connection connection = DriverManager.getConnection(jdbcurl);
	String sql ="SELECT * FROM movies" ; 
	Statement statement = connection.createStatement();
	ResultSet result = statement.executeQuery(sql);
	while (result.next())
	{
		String moviename = result.getString("movie_names");
		String leadactor = result.getString("Lead_actor");
		String leadactress = result.getString("lead_actress");
		String year = result.getString("Year_of_release");
		String director = result.getString("Director_name");
		
		System.out.println(moviename +  " | " + leadactor + " | " + leadactress +  " | " + year + " | " +  director);
	}
	} 
    catch (SQLException e) 
    { System.out.println("Error connecting to SQlite databse");
		e.printStackTrace();
    }

	}
}
