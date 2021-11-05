package tp2.doors;

import java.util.List;

public class Door {
	protected boolean isLocked = true;
	protected boolean isOpen = false;
	
	public Door() {
		this.isLocked = true;
		this.isOpen = false;
	}
	
	public boolean isOpen() {
		return this.isOpen;
	}
	
	public boolean isLocked() {
		return this.isLocked;
	}
	
	public void open() {
		if(!this.isLocked) {
			this.isOpen = true;
		}
	}
	
	public void close() {
		if(!this.isLocked) {
			this.isOpen = false;
		}
	}
	
	public void lock() {
		this.isLocked = true;
	}
	
	public void unlock() {
		this.isLocked = false;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Door)) {
			return false;
		}else {
			Door no = (Door) o;
			if(this.isLocked == no.isLocked && this.isOpen == no.isOpen) {
				return true;
			}
		}
		
		return false;
	}/**/
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " |  is locked : " + this.isLocked + ", is open : " + this.isOpen;
	}
	
	public static void printDoorList(List<? extends Door> l) {
		l.forEach(o -> o.print());
	}
}
