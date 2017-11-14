package org.sample.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="EMPLOYEE_DETAILS")

public class Employee {
	
	public Employee() {
		super();
		
	}

	public Employee( String name, String email, long phno) {
		super();
		//this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	
	
    @Id
    @GeneratedValue
    @Column(name="EMP_ID")
	private int id;
    @Column(name="EMP_NAME",length = 150,nullable = false)
	private String name;
    @Column(name="EMAIL_ID",length = 150,nullable = false,unique = true)
	private String email;
    @Column(name="PHONE",length = 10,nullable = false,unique = true)
	private long phno;
    
    @Column(name="BASIC_SALARY")
	private double basicSalary;
    @Column(name="HRA")
	private float houserentAllowance;
    @Column(name="TA")
	private float travelAllowance;
    @Column(name="DA")
	private float dearnessAllowance;
    @Column(name="PF")
	private float providentFund;
    @Transient
	private float netSalary;
    
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getHouserentAllowance() {
		return houserentAllowance;
	}

	public void setHouserentAllowance(float houserentAllowance) {
		this.houserentAllowance = houserentAllowance;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

};

