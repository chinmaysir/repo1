package com.log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}
 
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		System.out.println(" Reg Request Reached");
		String  clientnumber=req.getParameter("lun");
		String clienttype=req.getParameter("typ");
		String d_o_b=req.getParameter("dob");
		String mobile=req.getParameter("no");
		String address=req.getParameter("add");
		String state=req.getParameter("stat");
		String ini_amt=req.getParameter("amt");
		String name=req.getParameter("un");
		String password=req.getParameter("pwd1");
		String Age=req.getParameter("age");
		String email=req.getParameter("em");
		String city=req.getParameter("cty");
		String nation=req.getParameter("nat");
		String num_pay=req.getParameter("nop");
		String Creat_date=req.getParameter("doc");
		
		System.out.println(clientnumber+" "+clienttype+" "+d_o_b+" "+mobile+" "+address+" "+state+" "+ini_amt+" "+name+" "+password+" "+Age+" "+email+" "+city+" "+nation+" "+num_pay+" "+Creat_date);
		
		HttpSession session=req.getSession();
		session.setAttribute("cn",clientnumber);
		session.setAttribute("db",d_o_b);
		session.setAttribute("mo",mobile);
		session.setAttribute("addr",address);
		session.setAttribute("st",state);
		session.setAttribute("ctyp",clienttype);
		session.setAttribute("initial",ini_amt);
		session.setAttribute("cliname",name);
		session.setAttribute("pd",password);
		session.setAttribute("ag",Age);
		session.setAttribute("mail",email);
		session.setAttribute("ct",city);
		session.setAttribute("N",nation);
		session.setAttribute("n_p",num_pay);
		session.setAttribute("cd",Creat_date);
		
		
		
		
		
		
		
		
		Insurance c=new Insurance(clientnumber,clienttype,d_o_b,mobile,address,state,ini_amt,name,password,Age,email,city,nation,num_pay,Creat_date);
		PrintWriter pw=res.getWriter();
		DBOperation op=new DBOperation();
		int id1;
		id1=op.insert(c);
		if(id1!=0){
			pw.println("account created successfully");
			
		}
		else{
			pw.println("try to reg again");
		}
 }



}


