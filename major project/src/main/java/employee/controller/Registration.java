package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public Registration() {
        super();
       // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       out.println("<h1><center>Registration Successfully</center></h1>");
	       String employeeRNO = request.getParameter("srollno");
	       String employeeName = request.getParameter("sname");
	       out.print("<h3>REG_NO :" + employeeRNO + "</h3>");
	       out.print("<h3>Employee Name :" + employeeName + "</h3>");
	       Connection connection = null;
	       Statement statement = null;
	       ResultSet resultSet = null;
	       String url = "jdbc.mysql://localhost:3306/employee";
	       try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?charcterEncoding=utf8","root","1234");
	    	statement = connection.createStatement();
	    	String insert = "insert into emp (employee_RNO, employee_name) values('"+employeeRNO+"','"+employeeName+"')";
	    	statement.executeUpdate(insert);
	    	response.sendRedirect("View_record.jsp");
	    	connection.close();
	    	
	    }catch(Exception e) {
	    	System.out.println("connection not successfully");
	    	System.out.println(e.getMessage());
	    }
	
	}
}

