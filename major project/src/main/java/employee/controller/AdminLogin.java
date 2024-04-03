package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       out.println("<h1><center>Login Successfully</center></h1>");
	       String employeename = request.getParameter("username");
	       String employeepassword = request.getParameter("npassword");
	       Connection connection = null;
	       Statement statement = null;
	       ResultSet resultSet = null;
	       String url = "jdbc.mysql://localhost:3306/cmp";
	       try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmp?charcterEncoding=utf8","root","1234");
	    	statement = connection.createStatement();
	    	String insert = "insert into cmp.admin_signup (username,password) values('"+employeename+"','"+employeepassword+"')";
	    	statement.executeUpdate(insert);
	    	//response.sendRedirect("payroll.jsp");
	    	connection.close();
	    	
	    }catch(Exception e) {
	    	System.out.println("connection not successfully");
	    	System.out.println(e.getMessage());
	    }
	
	}

}
