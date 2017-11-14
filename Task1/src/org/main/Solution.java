package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.dummy.hosp.Hospital;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();// creates
																										// table
		Session session = sf.openSession();
		int i = 0;
		while (i < 2) {
			i++;

			session.beginTransaction();

			System.out.print("FIRST NAME :");
			String fname = bf.readLine();
			System.out.print("LAST NAME :");
			String lname = bf.readLine();
			System.out.print("PHONE :");
			long phno = Long.valueOf(bf.readLine());
			System.out.print("EMAIL ID");
			String email = bf.readLine();
			System.out.print("DOB :");
			String dob = bf.readLine();
			System.out.print("GENDER :");
			String gender = bf.readLine();
			System.out.print("ADDRESS");
			String address = bf.readLine();
			System.out.print("DISEASE");
			String disease = bf.readLine();

			Hospital hos = new Hospital(fname, lname, phno, email, dob, gender, address, disease);
			System.out.println("First_Name : " + hos.getFname());
			System.out.println("last_Name : " + hos.getLname());
			System.out.println("Phone : " + hos.getPhno());
			System.out.println("Email Id : " + hos.getEmail());
			System.out.println("Dob : " + hos.getDob());
			System.out.println("Gender: " + hos.getGender());
			System.out.println("Address : " + hos.getAddress());
			System.out.println("Disease : " + hos.getDisease());
			session.save(hos);
		}
		session.getTransaction().commit();

		session.close();
		sf.close();
	}

}
