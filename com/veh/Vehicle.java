package com.veh;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="VHCL_TYPE",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Vehi")

public class Vehicle {
	@GeneratedValue
	@Id
	private int vehicleid;
	private String name;

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle() {
		super();

	}

}
