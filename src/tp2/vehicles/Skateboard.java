package tp2.vehicles;

public class Skateboard extends Vehicule {
	
	public Skateboard() {
		super(4, 'S');
	}

	@Override
	public void performSpecialAction() {
		this.accelerate();
		System.out.println("r/Woosh");
	}

}

