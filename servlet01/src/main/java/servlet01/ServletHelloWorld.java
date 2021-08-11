package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHelloWorld extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 888;

	private String msg;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		msg = "java265.com is Java WebSite.";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");

		// 实际的逻辑是在这里
		PrintWriter o = resp.getWriter();
		o.println("<h1>" + msg + "</h1>");

	}

}
