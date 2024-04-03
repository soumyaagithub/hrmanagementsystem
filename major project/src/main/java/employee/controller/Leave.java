package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RoomAllocation
 */
@WebServlet("/Leave")
public class Leave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Leave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		  session.removeAttribute("username");
		  session.invalidate();
		  response.sendRedirect("Leave.jsp");
		  
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       out.println("<h1><center>Registration Successfully</center></h1>");
	       String employeename = request.getParameter("name");
	       String employeeemail = request.getParameter("email");
	       String employeedepartment = request.getParameter("department");
	       String employeeleaveto = request.getParameter("leave");
	       String employeeleaveform = request.getParameter("leave1");
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
	    	String insert = "insert into cmp.leave (name,email,department,leaveto,leaveform) values('"+employeename+"','"+employeeemail+"','"+employeedepartment+"','"+employeeleaveto+"','"+employeeleaveform+"')";
	    	statement.executeUpdate(insert);
	    	//response.sendRedirect("payroll.jsp");
	    	connection.close();
	    	
	    }catch(Exception e) {
	    	System.out.println("connection not successfully");
	    	System.out.println(e.getMessage());
	    }
	
	}

		
	}



		
		




