package com.lymkl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class report001
 */
@WebServlet("/report001")
public class report001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public report001() {
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
		//doGet(request, response);
		
		
		
		request.setCharacterEncoding("EUC-KR");
		
		String id=request.getParameter("id");
		
		String pw=request.getParameter("pw");
		
		String name=request.getParameter("name");
		
		String email=request.getParameter("email");
		
		String site = request.getParameter("site");
		
		String job=request.getParameter("job");
		
		if (job=="")
			job = "학생";
				
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer=response.getWriter();
		writer.println("<html><head></head><body>");
		
		writer.println("아 이 디 :" + id + "<br/>");
		writer.println("비밀번호  :" + pw + "<br/>");
		writer.println("이   름 :" + name + "<br/>");
		writer.println("E-mail :" + email + "@" + site + "<br/>");
		writer.println("직   업 :" + job + "<br/>");
		
		writer.println("</body></html>");
		
		
		
		
			
		
		
		
	}

}
