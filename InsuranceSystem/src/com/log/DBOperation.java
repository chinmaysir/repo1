package com.log;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class DBOperation {

	public int insert(Insurance c) {
		Configuration cf= new Configuration();
		cf.configure("stu.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		Serializable se=ses.save(c);
		tx.commit();
		ses.close();
		factory.close();
		
		
		return (int)se; 
	
	}

	public boolean logincheck(String useraccno, String password) {
		
		String user;
		String pass;
		int flag=0;
		Configuration cf=new Configuration();
		cf.configure("stu.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		

		List l = ses.createQuery("from Insurance").list();
		for (Iterator iterator =l.iterator(); iterator.hasNext();) {
			Insurance cli = (Insurance) iterator.next();

			user = cli.getClientnumber();
			pass = cli.getPassword();

			if (user.equalsIgnoreCase(useraccno) && pass.equalsIgnoreCase(password)) {

				flag = 1;
				break;
			} else {

				flag = 0;
				}

		}
		tx.commit();
		ses.close();
		factory.close();

		if (flag == 1) {

			return true;

		} else {
			
			return false;
		}
		
		
	}

}