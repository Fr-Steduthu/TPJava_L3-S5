package tp2.stylos;

public class Jetable extends Stylo {
	
	@Override
	public void replaceCartridge(Cartridge c) {
		this.cartridge = null;
	}
}
