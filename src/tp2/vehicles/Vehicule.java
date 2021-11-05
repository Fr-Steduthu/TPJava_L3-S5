
package tp2.vehicles;

public abstract class Vehicule {
	private int position = 0;
	private int speed = 0;
	private final int MAX_SPEED;
	
	private boolean state = true;
	private final char TYPE;
	
	public Vehicule(int mxSpd, char t) {
		this.MAX_SPEED = mxSpd;
		this.TYPE = t;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public void accelerate() {
		if(this.speed < this.MAX_SPEED && this.state) {
			this.speed++;
		}
	}
	
	public void decelerate() {
		if(this.speed > 0 && this.state) {
			this.speed--;
		}
	}
	
	public void stop() {
		this.speed = 0;
	}
	
	public void printPosition() {
		for(int i = 0; i < this.getPosition(); i++) {
			System.out.print("-");
		}
		System.out.println(this.getType());
	}
	
	public void forward() {
		this.position += this.speed;
	}
	
	public void destroy() {
		this.state = false;
	}
	
	public String getType() {
		if(!this.getState()) {
			return "[*]";
		}
		return "["+ this.TYPE +"]";
	}
	
	public void setPosition(int i) {
		this.position = i;
	}
	
	abstract public void performSpecialAction();
}

package tp2.vehicles;

public abstract class Vehicule {
	private int position = 0;
	private int speed = 0;
	private final int MAX_SPEED;
	
	private boolean state = true;
	private final char TYPE;
	
	public Vehicule(int mxSpd, char t) {
		this.MAX_SPEED = mxSpd;
		this.TYPE = t;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public void accelerate() {
		if(this.speed < this.MAX_SPEED && this.state) {
			this.speed++;
		}
	}
	
	public void decelerate() {
		if(this.speed > 0 && this.state) {
			this.speed--;
		}
	}
	
	public void stop() {
		this.speed = 0;
	}
	
	public void printPosition() {
		for(int i = 0; i < this.getPosition(); i++) {
			System.out.print("-");
		}
		System.out.println(this.getType());
	}
	
	public void forward() {
		this.position += this.speed;
	}
	
	public void destroy() {
		this.state = false;
	}
	
	public String getType() {
		if(!this.getState()) {
			return "[*]";
		}
		return "["+ this.TYPE +"]";
	}
	
	public void setPosition(int i) {
		this.position = i;
	}
	
	abstract public void performSpecialAction();
}

