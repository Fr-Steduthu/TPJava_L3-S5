package tp4.exceptions;

public class InvalidBatteryCapacityException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidBatteryCapacityException(){
		super("Battery capacity has to be stricly superior to 0");
	}

}

