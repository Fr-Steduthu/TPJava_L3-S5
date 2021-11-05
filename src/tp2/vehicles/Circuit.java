package tp2.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Circuit {
	public int length;
	public List<Vehicule> vehicules;
	
	public Circuit(int length) {
		this.length = length;
		this.vehicules = new ArrayList<Vehicule>();
	}
	
	private void initRace() {
		for(Vehicule c : this.vehicules) {
			c.setPosition(0);
		}
	}
	
	public List<Vehicule> race() {
		initRace();
		List<Vehicule> winners = new ArrayList<>();
		
		while(winners.isEmpty()) {
			this.vehicules.forEach(v -> {
				v.accelerate();
				v.forward();
			});
		
			this.vehicules.get(new Random().nextInt(this.vehicules.size())).performSpecialAction();
			
			this.vehicules.forEach(v -> {
				v.printPosition();
				if(v.getPosition() >= this.length) {
					winners.add(v);
				}
			});
		}
		
		return winners;
	}
	
	public void addVehicule(Vehicule v) {
		this.vehicules.add(v);
	}
	
	public void printAll() {
		for(Vehicule v : this.vehicules) {
			v.printPosition();
			System.out.println("\n");
		}
	}
	
	public static void main(String args[]) {
		Circuit c = new Circuit(10);
		
		c.addVehicule(new Skateboard());
		c.addVehicule(new Tank(c.vehicules));
		c.addVehicule(new Tank(c.vehicules));
		c.addVehicule(new Car());
		c.addVehicule(new Car());
		c.addVehicule(new Skateboard());
		
		List<Vehicule> out = c.race();
		System.out.println(out);
	}
}
