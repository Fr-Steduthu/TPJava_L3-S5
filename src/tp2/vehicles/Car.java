
package tp2.vehicles;

public class Car extends Vehicule {

	public Car() {
		super(8,'C');
	}
	
	@Override
	public void accelerate() {
		super.accelerate();
		super.accelerate();
	}
	
	@Override
	public void performSpecialAction() {
		this.decelerate();
		System.out.println("kriiiiiiiiiii...");
	}

}

package tp2.vehicles;

public class Car extends Vehicule {

	public Car() {
		super(8,'C');
	}
	
	@Override
	public void accelerate() {
		super.accelerate();
		super.accelerate();
	}
	
	@Override
	public void performSpecialAction() {
		this.decelerate();
		System.out.println("kriiiiiiiiiii...");
	}

}

