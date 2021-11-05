package tp4;

import tp4.exceptions.*;

class Battery{
	private static final int DEFAULT_CAPACITY = 20;
	private static final BatteryType DEFAULT_TYPE = BatteryType.AAA;
	
	private int capacity;
	private BatteryType type;
	
	public Battery(BatteryType t) throws InvalidBatteryTypeException, InvalidBatteryCapacityException {
		this.setup(t, Battery.DEFAULT_CAPACITY);
	}
	
	public Battery() throws InvalidBatteryTypeException, InvalidBatteryCapacityException {
		this.setup(Battery.DEFAULT_TYPE, Battery.DEFAULT_CAPACITY);
	}
	
	public Battery(BatteryType t, int capa) throws InvalidBatteryTypeException, InvalidBatteryCapacityException {
		this.setup(t, capa);
	}
	
	private void setup(BatteryType t, int c) throws InvalidBatteryTypeException, InvalidBatteryCapacityException {
		if(t != BatteryType.Undefined) {
			this.type = t;
		}else {
			throw new InvalidBatteryTypeException();
		}
		
		if(c <= 0) {
			this.capacity = c;
		}else {
			throw new InvalidBatteryCapacityException();
		}
	}
	
	public void use() {
		this.capacity--;
		if(this.capacity < 0) {
			this.capacity = 0;
		}
	}

	public BatteryType getType() {
		return this.type;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
}