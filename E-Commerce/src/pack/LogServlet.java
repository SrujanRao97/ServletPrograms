package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		String user=request.getParameter("FirstName");
		String pass=request.getParameter("Password");
		
		if(user.equals("srujan") && pass.equals("srujan"))
		{
			pw.println("<img src='images/1.jpg' height='300px' width='200px' alt='Howww'>");
			pw.println("<img src='images/2.jpg' height='300px' width='200px'  alt='Hiii'>");
			pw.println("<img src='images/3.jpg' height='300px' width='200px'  alt='Hello'>");
		}
		else
		{
			pw.println("UnSuccesfull Login");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
