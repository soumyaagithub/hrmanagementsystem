package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateRecord
 */
@WebServlet("/UpdateRecord")
public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public UpdateRecord() {
      super();
       // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<h1><center>Registration successfully</center></h1>");
		String sIdNo = request.getParameter("SID");
		String sRollNo = request.getParameter("SRNO");
		String sName = request.getParameter("SNAME");
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?charcterEncoding=utf8","root","1234");
			pst = con.prepareStatement("update emp set employee_RNO=?, employee_name=? where employee_id=?");
			pst.setString(1, sRollNo);
			pst.setString(2, sName );
			pst.setString(3,   sIdNo);
			pst.executeUpdate();
			response.sendRedirect("View_record.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
		
	}

}