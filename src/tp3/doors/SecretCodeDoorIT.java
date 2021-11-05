
package tp3.doors;

import org.junit.Before;
import org.junit.Test;

public class SecretCodeDoorIT {
	SecretCodeDoor d;
	
	@Before
	public void setup() {
		d = new SecretCodeDoor(27);
	}
	
	@Test
	public void mainTest() {
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.unlock();
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.unlock(0);
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.open();
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.unlock(27);
		assert(d.isLocked() == false);
		assert(d.isOpen() == false);
		
		d.open();
		assert(d.isLocked() == false);
		assert(d.isOpen() == true);
		
	}

}

package tp3.doors;

import org.junit.Before;
import org.junit.Test;

public class SecretCodeDoorIT {
	SecretCodeDoor d;
	
	@Before
	public void setup() {
		d = new SecretCodeDoor(27);
	}
	
	@Test
	public void mainTest() {
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.unlock();
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.unlock(0);
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.open();
		assert(d.isLocked() == true);
		assert(d.isOpen() == false);
		
		d.unlock(27);
		assert(d.isLocked() == false);
		assert(d.isOpen() == false);
		
		d.open();
		assert(d.isLocked() == false);
		assert(d.isOpen() == true);
		
	}

}

