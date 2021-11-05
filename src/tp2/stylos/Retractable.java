
package tp2.stylos;

public class Retractable extends Stylo {
	protected boolean isLeadOut = true;
	
	@Override
	public void write(String s) {
		if(this.isLeadOut) {
			super.write(s);
		}
	}
	
	public void leadOut() {
		this.isLeadOut = true;
	}
	
	public void leadIn() {
		this.isLeadOut = false;
	}
}

package tp2.stylos;

public class Retractable extends Stylo {
	protected boolean isLeadOut = true;
	
	@Override
	public void write(String s) {
		if(this.isLeadOut) {
			super.write(s);
		}
	}
	
	public void leadOut() {
		this.isLeadOut = true;
	}
	
	public void leadIn() {
		this.isLeadOut = false;
	}
}

