package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/expressionMapController")
public class ExpressionMapController  extends HttpServlet{
			
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HashMap<String, String> map= new HashMap<String, String>(); 
		map.put("Key1", "1905");
		map.put("Key2", "1907");
		map.put("Key3", "1903");
		
		req.setAttribute("myMap", map);
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("expressionLanguageDot.jsp");
		reqDispatcher.forward(req, resp);
 		
	}
}
