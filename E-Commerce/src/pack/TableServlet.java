package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Tab")
public class TableServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession h=request.getSession();
		String s1=(String) h.getAttribute("FirstName");
		String s2=(String) h.getAttribute("LastName");
		String s3=(String) h.getAttribute("UserName");
		String s6=(String) h.getAttribute("Gender");
		String s7=(String) h.getAttribute("Hobbies");
		PrintWriter p=response.getWriter();
		p.println("<table border='3' align='center' cellpadding='2' cellspacing='4'>");
		p.println("<tr><th>Name</th><th>Data</th></tr>");
		p.println("<tr><td>First Name</td><td>"+s1+"</td></tr>");
		p.println("<tr><td>Last Name</td><td>"+s2+"</td></tr>");
		p.println("<tr><td>User Name</td><td>"+s3+"</td></tr>");
		p.println("<tr><td>Gender</td><td>"+s6+"</td></tr>");
		p.println("<tr><td>Hobbies</td><td>"+s7+"</td></tr></table>");
		
		p.println("<a  href='Login.html'>Go to Login page</a>");
	}

}
