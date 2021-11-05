
package tp2.stylos;

import java.awt.Color;

public class MultiColorPen extends Stylo {
	
	private Cartridge cartridges[];
	
	public MultiColorPen(Color c[]) {
		this.cartridges = new Cartridge[c.length];
		
		for(int i = 0; i < c.length; i++) {
			this.cartridges[i] = new Cartridge(c[i]);
		}
		
		this.cartridge = null;
	}
	
	public void switchColor(int i) {
		this.cartridge = this.cartridges[i];
	}
	
}

package tp2.stylos;

import java.awt.Color;

public class MultiColorPen extends Stylo {
	
	private Cartridge cartridges[];
	
	public MultiColorPen(Color c[]) {
		this.cartridges = new Cartridge[c.length];
		
		for(int i = 0; i < c.length; i++) {
			this.cartridges[i] = new Cartridge(c[i]);
		}
		
		this.cartridge = null;
	}
	
	public void switchColor(int i) {
		this.cartridge = this.cartridges[i];
	}
	
}

