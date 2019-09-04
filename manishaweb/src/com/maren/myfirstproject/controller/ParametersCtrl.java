//java package(Manisha)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(Manisha)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ParametersCtrl(Manisha)
 */
@WebServlet("/ParametersCtrl")
public class ParametersCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Manisha)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//retrieve request parameter (Manisha)
		String name166=request.getParameter("txtName");
		String pass166=request.getParameter("pass");
		// returns a printwriter object that can send character text to the client(Manisha)
		PrintWriter out=response.getWriter();
		//name and password would simply print(Manisha)
		out.print("<b> Name <b>:"+name166);
		out.print("<b> Password <b>:"+pass166);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Manisha)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
