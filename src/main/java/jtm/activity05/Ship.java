package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {
	
	protected byte NumOfSails;
	
	public Ship(String id, byte NumOfSails) {
		super(id, 0, 0);
		this.NumOfSails = NumOfSails;
	}//end constructor

	@Override
	public String move(Road road) {
		if(road instanceof WaterRoad) {
			return getType() + " is sailing on " + road + " with " + NumOfSails + " sails";
		}else
		return "Cannot sail on " + road;
	}

}//end class
