package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {
	
	protected byte NumOfSails;
	private String id;
	
	public Ship(String id, byte NumOfSails) {
		super(id, 0f, 0);
		this.id = id;
		this.NumOfSails = NumOfSails;
	}//end constructor

	@Override
	public String move(Road road) {
		String movement = "";
		float fuelAmount = (super.getConsumption() * road.getDistance())/100;
		
		if(getFuelInTank() >= fuelAmount && road.getClass() == Road.class) {
			super.setFuelInTank (getFuelInTank() - fuelAmount);
		}
		return movement;
	}

}//end class
