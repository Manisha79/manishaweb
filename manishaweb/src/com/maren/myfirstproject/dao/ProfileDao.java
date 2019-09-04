//java package(Manisha)
package com.maren.myfirstproject.dao;
//importing all the classes from the packages(Manisha)
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.myproject.model.Profile;
//class profiledao (Manisha)
public class ProfileDao {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
		//database mysql connection(Manisha)
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
	}
	//save is the method for class profile(Manisha)
	public int save(Profile profile) {
		//connection and statement has been kept null(Manisha)
		Connection con166 = null;
		Statement st166 = null;
		int res166 = 0;
		//exception handling(Manisha)
		try {
			//getting connection with datadabse(Manisha)
			con166 = getConnection();
			//creating statements(Manisha)
			st166 = con166.createStatement();
			//executing queries(Manisha)
			res166 = st166.executeUpdate("INSERT INTO test.profile (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack trace for this throwable object on the standard error output stream(Manisha)
			e.printStackTrace();
		}finally {
			try {
				st166.close();
				con166.close();
			} catch (SQLException e) {
	//this method prints a stack trace for this throwable object on the standard error output stream(Manisha)
				e.printStackTrace();
			}
		}
		//terminates the execution of a function and return control to the calling function(Manisha)
		return res166;
	}
	//fetches all remaining row in the result set(Manisha)
	public List<Profile> fetchAll() {
		//connection and statement has been kept null(Manisha)
		List<Profile> list166=null;
		Connection con166 = null;
		Statement st166 = null;
		//exception handling(Manisha)
		try {
			//getting connection with datadabse(Manisha)
			con166 = getConnection();
			//creating statements(Manisha)
			st166 = con166.createStatement();
			//executing queries(Manisha)
			ResultSet rs166 = st166.executeQuery("SELECT * FROM test.profile");
			if(rs166 != null)
				//creating an array for the storage(Manisha)
				list166 = new ArrayList<>();
			while(rs166.next()) {
				////creating a new object profile166 of the class(Manisha)
				Profile pr = new Profile();
				// the set method would set the value and get method will return the variable value(Manisha)
				pr.setUserid(rs166.getString("userid"));
				pr.setName(rs166.getString("name"));
				pr.setEmail(rs166.getString("email"));
				pr.setMobile(rs166.getLong("mobile"));
				list166.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st166.close();
				con166.close();
			} catch (SQLException e) {
//this method prints a stack trace for this throwable object on the standard error output stream(Manisha)
				e.printStackTrace();
			}
			
		}
//terminates the execution of a function and return control to the calling function(Manisha)
		return list166;
	}
	//main function(Manisha)
	public static void main(String[] args) {
		Connection con166 = null;
		Statement st166 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con166 = DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
			st166 = con166.createStatement();
			ResultSet rs166 = st166.executeQuery("SELECT * FROM test.student");
			while(rs166.next()) {
				String id = rs166.getString("userid");
				String name = rs166.getString("name");
				String email = rs166.getString("email");
				long mobile = rs166.getLong("mobile");
				System.out.println("Id : " +id + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st166.close();
				con166.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
