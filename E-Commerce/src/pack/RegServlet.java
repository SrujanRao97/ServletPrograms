package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String str1=request.getParameter("fname");
		String str2=request.getParameter("lname");
		String str3=request.getParameter("uname");
		String str4=request.getParameter("pass");
		String str5=request.getParameter("cpass");
		String str6=request.getParameter("sex");
		String str7=request.getParameter("hobbies");
		if(str4.equals(str5))
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<h1 align='center'>You have Successfully registered</h1>");
			
			HttpSession ses=request.getSession();
			ses.setAttribute("FirstName", str1);
			ses.setAttribute("LastName", str2);
			ses.setAttribute("UserName", str3);
			ses.setAttribute("Password", str4);
			ses.setAttribute("CPassword", str5);
			ses.setAttribute("Gender", str6);
			ses.setAttribute("Hobbies", str7);
			
			RequestDispatcher rd=request.getRequestDispatcher("Tab");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Password and Confirm password are Different");
			RequestDispatcher rd=request.getRequestDispatcher("Register.html");
			rd.include(request, response);
		}
	}

	

}
