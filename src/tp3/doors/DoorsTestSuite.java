package tp3.doors;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({tp3.doors.AutoLockDoorIT.class, tp3.doors.SecretCodeDoorIT.class, tp3.doors.ClosedDoorIT.class})

public class DoorsTestSuite {

}