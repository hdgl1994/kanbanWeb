import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.util.*;

//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class holaMundito
 */
//@WebServlet("/holaMundito")
public class holaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		writer.print("<html><body><h1>Hola Mundo</h1>"+new Date().toString()+"</body></html>");
	}
}