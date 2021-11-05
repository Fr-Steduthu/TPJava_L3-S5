
package tp4;

import tp4.exceptions.*;

public class Main {
	
	public static void main(String args[]) throws InvalidNbBatteryException, InvalidBatteryTypeException {
		Robot r = new Robot("Mephisto", BatteryType.AAA, 3, 50);
		
		r.turnOn();
		r.printName();
		r.turnOff();
	}
}

package tp4;

import tp4.exceptions.*;

public class Main {
	
	public static void main(String args[]) throws InvalidNbBatteryException, InvalidBatteryTypeException {
		Robot r = new Robot("Mephisto", BatteryType.AAA, 3, 50);
		
		r.turnOn();
		r.printName();
		r.turnOff();
	}
}

