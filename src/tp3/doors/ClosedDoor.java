package tp3.doors;

import java.util.ArrayList;
import java.util.List;

public class ClosedDoor extends AutoLockDoor {

	@Override
	public void open() {}
	
	public static void main(String args[]) {
		List<AutoLockDoor> li =  new ArrayList<>();
		li.add(new AutoLockDoor());
		li.add(new SecretCodeDoor(452));
		
		Door.printDoorList(li);
		
		List<AutoLockDoor> lii= li.stream().filter(d -> d instanceof SecretCodeDoor).toList();
		lii.forEach(d -> d.close());

		System.out.println(li.stream().filter(d -> d instanceof AutoLockDoor && d.isOpen()).toList().size());
		Door.printDoorList(lii);
		
		li.forEach(d -> d.open());
		List<? extends Door> liii = li.stream().filter(d -> d.isOpen()).toList();
		Door.printDoorList(liii);

	}
}
