package employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BoysLogin
 */
@WebServlet("/LoginServelt")
public class LoginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelt() {
        super();
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
		PrintWriter out=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		  session.removeAttribute("username");
		  session.invalidate();
	doGet(request, response);
	response.sendRedirect("AdminLogin.jsp");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");
			String n=request.getParameter("username");
			String p=request.getParameter("npassword");
			PreparedStatement ps=con.prepareStatement("select username from login where username=? and password=?");
		ps.setString(1, n);
		ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
				rd.forward(request, response);
			}
			else {
				out.println("<font color=red size=18>login failed!!<br>");
				out.println("<a href=login.jsp>Try again!!</a>");
			}
	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}


