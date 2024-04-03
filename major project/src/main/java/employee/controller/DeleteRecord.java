package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteRecord
 */
@WebServlet("/DeleteRecord")
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Statement stat;
	PreparedStatement pst;
	ResultSet rs;
	int row;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public DeleteRecord() {
        super();
       // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1><center>Record deleted successfully</center></h1>");
		String eId = req.getParameter("d");
		Integer employeeId = Integer.parseInt(eId);
		//out.println(eId);
		//out.println(employeeId);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?charcterEncoding=utf8","root","1234");
			Statement stat = conn.createStatement();
			stat.executeUpdate("delete from emp where employee_id='"+employeeId+"'");
			res.sendRedirect("View_record.jsp");
			
}catch(Exception e) {
	e.printStackTrace();
	out.println(e.getMessage());
}
	}

}