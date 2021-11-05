package tp3.doors;

public class AutoLockDoor extends Door {
	
	@Override
	public void close() {
		if(!this.isLocked) {
			this.isOpen = false;
			this.isLocked = true;
		}
	}
}
