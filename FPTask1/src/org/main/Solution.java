package org.main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sample.facebook.Facebook;

public class Solution {

	public static void main(String[] args) throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			SessionFactory sf = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();//creates table
			Session session = sf.openSession();
			int i=0;
			while(i<2){ 
				i++;
			
			session.beginTransaction();
			
			System.out.print("FIRST NAME :");
			String fname = bf.readLine();
			System.out.print("LAST NAME :");
			String lname = bf.readLine();
			System.out.print("PHONE :");
			long phno  = Long.valueOf(bf.readLine());
			System.out.print("EMAIL ID");
			String email = bf.readLine();
			System.out.print("DOB :");
			String dob = bf.readLine();
			System.out.print("GENDER :");
			String gender = bf.readLine();
			System.out.print("PASSWORD");
			String pwd = bf.readLine();
			
			
			Facebook fac = new Facebook(fname, lname, phno, email, dob, gender, pwd);
			System.out.println("First_Name : " + fac.getFname());
			System.out.println("last_Name : " + fac.getLname());
			System.out.println("Phone : " + fac.getPhno());
			System.out.println("Email Id : " + fac.getEmail());
			System.out.println("Dob : " + fac.getDob());
			System.out.println("Gender: " + fac.getGender());
			System.out.println("Password : " + fac.getPwd());
			session.save(fac);
			session.getTransaction().commit();
		}
			session.close();
			sf.close();
		}

	}


