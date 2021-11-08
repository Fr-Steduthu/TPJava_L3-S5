package tp3.doors;

public class SecretCodeDoor extends AutoLockDoor{
	private final int SECRETCODE;
	
	public SecretCodeDoor(int code) {
		super();
		this.SECRETCODE = code;
	}
	
	@Override
	public void unlock() {
		System.out.println("This door cannot be opened without its code");
	}
	
	public void unlock(int code) {
		if(code == this.SECRETCODE) {
			this.isLocked = false;
		}
	}
}

