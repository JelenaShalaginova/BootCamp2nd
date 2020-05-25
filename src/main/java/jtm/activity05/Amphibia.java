package jtm.activity05;

import jtm.activity04.Road;

public class Amphibia extends Ship {
	private int NumOfWheels;

	public Amphibia(String id, float consumption, int tankSize, byte numOfSails, int NumOfWheels) {
		super(id, numOfSails);
		this.NumOfWheels= NumOfWheels;
	}

	@Override
	public String move(Road road) {
		String status = "";
		if (road instanceof WaterRoad) {
			
			WaterRoad waterRoad = (WaterRoad) road;
			return super.move(waterRoad);
			
		}else {
			Road groundRoad = road;
			return getType() + " is driving on " + road + " with " + NumOfWheels + " wheels";
		}
		
}	
	

}//end class
