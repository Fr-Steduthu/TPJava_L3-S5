package tp1;

public class Robot {
	public final String name;
	
	public Robot(String s) {
		this.name = s;	
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
