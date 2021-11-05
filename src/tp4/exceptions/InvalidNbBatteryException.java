package tp4.exceptions;

public class InvalidNbBatteryException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidNbBatteryException() {
		super("Number of bateries has to be strictly superior to 0");
	}

}
