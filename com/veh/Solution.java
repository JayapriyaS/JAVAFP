package org.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.veh.FourWheeler;
import com.veh.TwoWheeler;
import com.veh.Vehicle;

public class Solution {

	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();// creates
	Session session = sf.openSession();																							// table
	Vehicle vehicle = new Vehicle();
	vehicle.setName("car");
	
	TwoWheeler two = new TwoWheeler();
	two.setName("Bike");
	two.setSteeringHandle("BikeSteering");
	
	FourWheeler four = new FourWheeler();
	four.setName("Porsche");
	four.setStreeingWheel("Porsche Streeing Wheel");
	
	
	session.beginTransaction();
	session.save(vehicle);
	session.save(two);
	session.save(four);
	session.getTransaction().commit();
	
	
	
	
	session.close();
	

}
}
