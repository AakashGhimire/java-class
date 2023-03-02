package servlet;

import java.io.IOException;

public class HelloServlet1 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("<h1>"+ " hello this is my first servlet"+ "</h1>");
		response.getWriter().println("<h1>"+ " do not write html in servlet "+ "</h1>");
		response.getWriter().println("<h1>"+ " write only java code in servlet "+ "</h1>");

		response.getWriter().println("<h1>"+ " use jsp to write HTML "+ "</h1>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
