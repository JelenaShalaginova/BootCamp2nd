package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {
	
	protected int NumOfWheels;

	
	public Vehicle(String id, float consumption, int tankSize, int NumOfWheels) {
		super(id, consumption, tankSize);
		this.NumOfWheels = NumOfWheels;
	}

	@Override
	public String move(Road road) {
		
		if (road.getClass() == Road.class) {
			String status = super.move(road);
			if(!status.startsWith("Cannot"))
				return getType() + " is driving on " + road + " with " + NumOfWheels +
						" wheels";
			else
				return status;
		}
		return "Cannot drive on " + road;
	}
	
	

}//end class
