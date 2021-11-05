package tp3.doors;

import org.junit.Before;
import org.junit.Test;

public class AutoLockDoorIT {

	AutoLockDoor d;
	
	@Before
	public void setUp() {
		d = new AutoLockDoor();
	}
	
	@Test
	public void mainTest() {
		assert(d.isOpen() == false);
		assert(d.isLocked() == true);
		
		d.open();
		assert(d.isOpen() == false);
		assert(d.isLocked() == true);
		
		d.unlock();
		assert(d.isOpen() == false);
		assert(d.isLocked() == false);
		
		d.open();
		assert(d.isOpen() == true);
		assert(d.isLocked() == false);
		
		d.lock();
		assert(d.isOpen() == true);
		assert(d.isLocked() == true);
		
		d.close();
		assert(d.isOpen() == true);
		assert(d.isLocked() == true);
	}
}
