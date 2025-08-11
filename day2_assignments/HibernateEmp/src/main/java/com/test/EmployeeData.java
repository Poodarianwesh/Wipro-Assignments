package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeData {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	   cfg.configure("Employee.cfg.xml");
	   SessionFactory sf = cfg.buildSessionFactory();
	   Session session = sf.openSession();
	   Transaction t = session.beginTransaction();
	   Employee obj = new Employee();
	   obj.setEmp_name("anwesh");
	   obj.setEmp_salary(50000);		
	   session.persist(obj);
	     
	  
	   /*Student obj = session.get(Student.class,1);
System.out.println(obj.getId()+" "+obj.getStd_name()+" "+obj.getStd_city());
obj.setStd_city("hyd");	
obj.setStd_name("anu");
session.persist(obj);*/

	   t.commit();
	   System.out.println("Done");
	   session.close();
	   
}
}


