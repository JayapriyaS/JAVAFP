package com.veh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Four Vehi")
public class FourWheeler extends Vehicle {
 private String streeingWheel;

public String getStreeingWheel() {
	return streeingWheel;
}

public void setStreeingWheel(String streeingWheel) {
	this.streeingWheel = streeingWheel;
}

public FourWheeler() {
	super();
	
}
 
}
