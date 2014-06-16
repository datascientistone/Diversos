package com.practicaljava.lesson27;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "book", urlPatterns = { "/books" }, description="Listar livros")
public class FindBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FindBooks() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	super.service(req, resp);
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("init...");
    };

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Vector vector = (Vector) session.getAttribute("teste");
		
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		out.println("<h2>Hello from FindBooks</h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
