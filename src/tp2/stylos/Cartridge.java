
package tp2.stylos;

import java.awt.Color;

public class Cartridge {
	protected int level = 50;
	protected final Color color;
	
	public Cartridge() {
		this.color = Color.BLUE;
	}
	
	public Cartridge(Color c) {
		this.color = c;
	}
	
	public boolean write(int i) {
		if(this.level -i < 0) {
			this.level -= i;
			return true;
		}
		return false;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public boolean isEmpty() {
		return level <= 0;
	}
}

package tp2.stylos;

import java.awt.Color;

public class Cartridge {
	protected int level = 50;
	protected final Color color;
	
	public Cartridge() {
		this.color = Color.BLUE;
	}
	
	public Cartridge(Color c) {
		this.color = c;
	}
	
	public boolean write(int i) {
		if(this.level -i < 0) {
			this.level -= i;
			return true;
		}
		return false;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public boolean isEmpty() {
		return level <= 0;
	}
}

