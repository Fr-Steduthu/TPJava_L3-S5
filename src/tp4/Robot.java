package tp4;

import tp4.exceptions.*;


public class Robot {
	private final String NAME;
	private States state;
	
	private final BatteryType requiredTypeOfBatteries;
	private Battery batteries[];
	
	public Robot(String name, BatteryType batteryType, int numberOfBatteries, int capacityOfBatteries) throws InvalidNbBatteryException, InvalidBatteryTypeException{
		this.state = States.OFF;
		this.NAME = name;
		
		if(numberOfBatteries <= 0) {
			throw new InvalidNbBatteryException();
		}
		
		this.batteries = new Battery[numberOfBatteries];
		this.requiredTypeOfBatteries = batteryType;
		
		for(int i = 0; i < numberOfBatteries; i++) {
			try {
				this.batteries[i] = new Battery(this.requiredTypeOfBatteries, capacityOfBatteries);
			}catch(InvalidBatteryCapacityException e){
				this.batteries[i] = new Battery(this.requiredTypeOfBatteries);
			}
		}
	}
	
	public void printName() {
		if(this.state == States.ON) {
			System.out.println(this.NAME);
			
			for(Battery b : this.batteries) {
				b.use();
			}
			
			if(this.powerRemaining() <= 0) {
				this.state = States.OFF;
			}
		}
	}
	
	public void turnOn() {
		if(this.getNumberOfDeadBatteries() == 0 || this.powerRemaining() >= 0) {
			this.state = States.ON;
		}
	}
	
	public void turnOff() {
		this.state = States.OFF;
	}
	
	public void setBattery(int i, Battery b) throws InvalidBatteryTypeException {
		if(b.getType() == this.requiredTypeOfBatteries) {
			this.batteries[i] = b;
		}else {
			throw new InvalidBatteryTypeException();
		}
	}
	
	public Integer powerRemaining() {
		int out = 0;
		for(Battery b : this.batteries) {
			out += b.getCapacity();
		}
		return out;
	}
	
	public int getNumberOfDeadBatteries() {
		int out = 0;
		for (Battery battery : this.batteries) {
			if(battery == null || battery.getCapacity() <= 0) {
				out++;
			}
		}
		return out;
	}
	
	public int[] getMissingBatterySlots() {
		if(this.getNumberOfDeadBatteries() == 0) {
			return null;
		}
		
		int[] arr = new int[this.getNumberOfDeadBatteries()];
		int unusedIndex = 0;
		for(int i = 0; i < this.batteries.length; i++) {
			Battery b = this.batteries[i];
			
			if(b == null || b.getCapacity() <= 0) {
				arr[unusedIndex] = i;
				unusedIndex++;
			}
		}
		
		return arr;
	}
	
	@Override
	public String toString() {
		return this.NAME + " is turned "+ this.state;
	}
}
