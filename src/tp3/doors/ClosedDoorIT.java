package tp3.doors;

import org.junit.Before;
import org.junit.Test;

public class ClosedDoorIT {
    private ClosedDoor d;

    @Before
    public void setUp() {
        d = new ClosedDoor();
    }

    @Test
    public void testOpen() {
    	d.open();
    	assert(d.isOpen() == false);
    }
    
    @Test
    public void testClose() {
    	d.close();
    	assert(d.isOpen() == false);
    }
    
    @Test
    public void testCreation() {
    	assert(d.isLocked() == true);
    	assert(d.isOpen() == false);
    }
}

