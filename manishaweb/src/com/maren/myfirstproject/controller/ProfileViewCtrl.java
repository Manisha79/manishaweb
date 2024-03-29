//java package(Manisha)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(Manisha)
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.model.Profile;
/**
 * Servlet implementation class ProfileViewCtrl(Manisha)
 */
@WebServlet("/ProfileViewCtrl")
public class ProfileViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Manisha)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//reuqest to get a value(Manisha)
		int res166 =  (int) request.getAttribute("RES");//added cast to int(Manisha)
		PrintWriter out = response.getWriter();// returns a printwriter object that can send character text to the client(Manisha)
		if (res166 == 0)//business logic
			//to output text to the console out.println prints the string and moves to next line(Manisha)
			out.println("There is some problem ;  Try again .");
		else
			out.println("Data Successfully insert");
		out.print(" <br/> The Datas are");
		//fetches all remaining row in the result set(Manisha)
		List<Profile> list =  new com.maren.myfirstproject.dao.ProfileDao().fetchAll();
		//iterator enables the programmer to traverse a container particularly lists(Manisha)
		for (Iterator<Profile> iterator = list.iterator(); iterator.hasNext();) {
			Profile profile166 = (Profile) iterator.next();
			out.println("Name : "+ profile166.getName() +" Userid : "+ profile166.getUserid()+ "mobile "+ profile166.getMobile()+"email"+profile166.getEmail());
		}
		

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Manisha)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
