/**
 * 
 */
package com.hb.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.model.Person;

/**
 * @author davul
 *
 */
public class TestHb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Configuration cfg=new Configuration();
		 * cfg.configure("com/hb/cnfg/hibernate.cfg.xml"); SessionFactory
		 * sfa=cfg.buildSessionFactory(); Session session=sfa.openSession(); Transaction
		 * txn=null; Person p=new Person(); //p.setId(1); p.setCountry("India");
		 * p.setName("Reddy"); p.setNum(1); boolean flag=false; try {
		 * txn=session.beginTransaction(); session.save(p); flag=true; }catch(Exception
		 * e) {
		 * 
		 * }finally { if(flag) { txn.commit(); System.out.println("Committed ");
		 * 
		 * session.close(); sfa.close();
		 * 
		 * }else { System.out.println("failed ");
		 * 
		 * }
		 * 
		 * session.close(); sfa.close(); }
		 * 
		 */
		Configuration cfg = new Configuration();
		cfg.configure("com/hb/cnfg/hibernate.cfg.xml");
		SessionFactory sfa = cfg.buildSessionFactory();
		//Session session1 = sfa.openSession();
		Transaction txn = null;
		//Person p1=session1.get(Person.class, 2);
		//session1.close();
		//p1.setCountry("GS");
		//p1.setNum(2);
		Person p3=new Person();
		p3.setCountry("fcfv");
		p3.setName("RR1R");
		//p3.setNum(4);
		Session session2 = sfa.openSession();
		//Person p2=session2.get(Person.class, 2);
		txn = session2.beginTransaction();
		
		//session2.saveOrUpdate(p3,p3.getId());
		//session2.saveOrUpdate(Person.class, p3);
		txn.commit();
		//sfa.close();
		session2.close();
		
		
	}

}
