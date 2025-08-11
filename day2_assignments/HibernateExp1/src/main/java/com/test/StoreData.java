package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {
   public static void main(String[] args) {
	   Configuration cfg = new Configuration();
	   cfg.configure("hibernate.cfg.xml");
	   SessionFactory sf = cfg.buildSessionFactory();
	   Session session = sf.openSession();
	   Transaction t = session.beginTransaction();
	   Student obj = new Student();
	   obj.setStd_name("anwesh");
	   obj.setStd_city("husnabad");		
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
