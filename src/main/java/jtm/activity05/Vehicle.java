package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {
	
	protected int NumOfWheels;
	private String id;
	
	public Vehicle(String id, float consumption, int tankSize, int NumOfWheels) {
		super(id, consumption, tankSize);
		this.NumOfWheels = NumOfWheels;
	}

	@Override
	public String move(Road road) {
		
		String movement = "";
		
		
		
		return movement;
		
	}
	
	

}//end class
