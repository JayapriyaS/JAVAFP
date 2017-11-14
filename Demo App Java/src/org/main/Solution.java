package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sample.emp.Employee;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();//creates table
		Session session = sf.openSession();
		int i=0;
		while(i<3){ 
			i++;
		
		session.beginTransaction();
		
		
		/*System.out.print("Enter ID");
		int id = Integer.valueOf(bf.readLine());*/
		System.out.print("Enter NAME");
		String name = bf.readLine();
		System.out.print("Enter EMAIL ");
		String email = bf.readLine();
		System.out.print("Enter PHONE");
		long phno = Long.valueOf(bf.readLine());
		
		
		Employee employee = new Employee( name, email, phno);
		//System.out.println("Id : " + employee.getId());
		System.out.println("Name : " + employee.getName());
		System.out.println("Email : " + employee.getEmail());
		System.out.println("Phone : " + employee.getPhno());
		session.save(employee);
		session.getTransaction().commit();
	}
		session.close();
		//sf.close();
	}
}
