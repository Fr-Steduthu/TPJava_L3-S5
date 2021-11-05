
package tp2.stylos;

import java.awt.Color;

public class Stylo {
	protected Cartridge cartridge;
	
	public Stylo() {
		this.cartridge = new Cartridge();
	}
	
	public Stylo(Color c) {
		this.cartridge = new Cartridge(c);
	}
	
	public void replaceCartridge(Cartridge c) {
		this.cartridge = c;
	}
	
	public void write(String s) {
		this.cartridge.write((s.length()));
	}
}

package tp2.stylos;

import java.awt.Color;

public class Stylo {
	protected Cartridge cartridge;
	
	public Stylo() {
		this.cartridge = new Cartridge();
	}
	
	public Stylo(Color c) {
		this.cartridge = new Cartridge(c);
	}
	
	public void replaceCartridge(Cartridge c) {
		this.cartridge = c;
	}
	
	public void write(String s) {
		this.cartridge.write((s.length()));
	}
}

