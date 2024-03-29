package jtm.activity04;

import java.util.Locale;

public class Transport {
	// Do not change access modifiers to encapsulate internal properties!
	private String id; // Transport registration number
	private float consumption; // fuel consumption in litres per 100km
	private int tankSize; // tank size in litres
	private float fuelInTank; // fuel in tank

	/*- TODO #1
	 * Select menu Source — Generate Constructor using Fields...
	 * and create constructor which sets id, consumption, tankSize
	 * values of the newly created object
	 * And make fuel tank full.
	 */
	public Transport(String id, float consumption, int tankSize) {
		this.setId(id);
		this.consumption = consumption;
		this.tankSize = tankSize;
		this.fuelInTank = tankSize;
	}


	/*- TODO #2
	 * Select menu: Source — Generate getters and Setters...
	 * and generate public getters for consumption, tankSize, id, and
	 * fuelInTank fields
	 */
	public String getId() {
		return id;
	}

	public float getConsumption() {
		return consumption;
	}

	public int getTankSize() {
		return tankSize;
	}


	public float getFuelInTank() {
		return fuelInTank;
	}
	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}


	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}


	public void setFuelInTank(float fuelInTank) {
		this.fuelInTank = fuelInTank;
	}
	

	public void setId(String id) {
		this.id = id;
	}


	/*- TODO #3
	 * Select menu: Source — Generate toString()...
	 * and implement this method, that returns String in form:
	 * "Id:ID cons:0.0l/100km, tank:00l, fuel:00.00l"
	 * where ID and numbers are actual properties of the transport
	 * HINT: use String.format(Locale.US, "%.2f", float) to limit shown digits
	 * to 2 decimal for fractions, and dot as a decimal delimiter.
	 */
	
	


	@Override
	public String toString() {
		
		return String.format(Locale.US, "Id:%s cons:%.1fl/100km, tank:%dl, fuel:%.2fl", getId(), consumption, tankSize, fuelInTank);
		
	}

	// Return transport id and type as string e.g. "AAA Transport"
	// HINT: use this.getClass().getSimpleName(); to get type of transport
	protected final String getType() {
		// TODO return required value
		String type = getId() +" "+ this.getClass().getSimpleName();
		
		return type;
	}


	
	

	// HINT: use getType() to describe transport and road.toString() to describe
	// road
	// HINT: String.format(Locale.US, "%.2f", float) to format float number with
	// fixed mask
	public String move(Road road) {
		
		
		float minFuel = (this.consumption * road.getDistance()) / 100;
		
		if(fuelInTank >= minFuel) {
		 fuelInTank -= minFuel;
			return String.format(Locale.US, "%s is moving on %s", getType(),road.toString());

		}else {
			
			return String.format(Locale.US, "Cannot move on %s. Necessary fuel:%.2fl, fuel in tank:%.2fl",road.toString(), minFuel, fuelInTank);
		}
		// TODO If transport has enough fuel, decrease actual amount of fuel by
		// necessary amount and return String in form:
		// "AAA Type is moving on Fromâ€“To, 180km"
		// TODO If there is no enough fuel in tank, return string in form:
		// "Cannot move on Fromâ€“To, 180km. Necessary
		// fuel:0.00l, fuel in tank:0.00l" --
		
		
	}



}