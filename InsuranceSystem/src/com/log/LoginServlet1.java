package com.log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class LoginServlet1 extends HttpServlet{
	

   
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		System.out.println("Login Request Reached");
		
		String useraccno=req.getParameter("lun");
		String password=req.getParameter("lpwd1");
		
		HttpSession session=req.getSession();
		session.setAttribute("user", useraccno);
		session.setAttribute("pas", password);
		
		PrintWriter pw=res.getWriter();
		DBOperation op=new DBOperation();
		boolean b=op.logincheck(useraccno, password);
		if(b!=true){
			pw.println("login failed");	
		}
		else{
			res.sendRedirect("loginacc.jsp");
		}
		
			
	}
	}
