package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reg
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       out.println("<h1><center>Registration Successfully</center></h1>");
	       String employeename = request.getParameter("name");
	       String employeeemail = request.getParameter("email");
	       String employeepassword = request.getParameter("pass");
	       String employeecontact = request.getParameter("contact");
	      // out.print("<h3>REG_NO :" + employeeRNO + "</h3>");
	      // out.print("<h3>Employee Name :" + employeeName + "</h3>");
	       Connection connection = null;
	       Statement statement = null;
	       ResultSet resultSet = null;
	       String url = "jdbc.mysql://localhost:3306/cmp";
	       try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmp?charcterEncoding=utf8","root","1234");
	    	statement = connection.createStatement();
	    	String insert = "insert into user1 (email,password,contact,name) values('"+employeeemail+"','"+employeepassword+"','"+employeecontact+"','"+employeename+"')";
	    	statement.executeUpdate(insert);
	    	response.sendRedirect("AdminLogin.jsp");
	    	connection.close();
	    	
	    }catch(Exception e) {
	    	System.out.println("connection not successfully");
	    	System.out.println(e.getMessage());
	    }
	
	}

	}
	
	
	

	
