//java package(Manisha)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(Manisha)
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.maren.myproject.model.Profile;
//class profiledao (Manisha)
public class Trans1Ctrl {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
		//database mysql connection(Manisha)
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
	}
	//save is the method for class profile(Manisha)
	@SuppressWarnings("null")
	public void save(Profile profile) {
		//connection and statement has been kept null(Manisha)
		Connection con166 = null;
		Statement st166 = null;
		int res166 = 0;
		//exception handling(Manisha)
		try {
			con166.setAutoCommit(false);
			//getting connection with datadabse(Manisha)
			con166 = getConnection();
			//creating statements(Manisha)
			st166 = con166.createStatement();
			//executing queries(Manisha)
			res166 = st166.executeUpdate("INSERT INTO test.profile (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		     if(res166 == 0)
		     {
		    	 con166.rollback();
		     }
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack trace for this throwable object on the standard error output stream(Manisha)
			e.printStackTrace();
		}
	}
}