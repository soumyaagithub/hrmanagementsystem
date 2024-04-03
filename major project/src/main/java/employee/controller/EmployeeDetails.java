package employee.controller;
//import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RoomAllocation
 */
@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		  String employeeName = request.getParameter("employeeName");
	        String employeeId = request.getParameter("employeeId");

	        // Perform room allocation logic here (e.g., save to a database or in-memory structure)

	        // Send a response to the user
	        response.setContentType("text/html");
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<div class='container'>");
	        response.getWriter().println("<h2>Employe Profile</h2>");
	        response.getWriter().println("<p>Employee Name: " + employeeName + "</p>");
	        response.getWriter().println("<p>Employee id: " + employeeId + "</p>");
	        response.getWriter().println("<p>Employee details!</p>");
	        response.getWriter().println("</div>");
	        response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		  session.removeAttribute("username");
		  session.invalidate();
		  response.sendRedirect("View_record.jsp");
		  
		
		
		
	}

}
