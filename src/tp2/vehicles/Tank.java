package tp2.vehicles;

import java.util.List;
import java.util.Random;

public class Tank extends Vehicule {
	private boolean missile = true;
	private List<Vehicule> board;

	public Tank(List<Vehicule> board) {
		super(2,'T');
		this.board = board;
	}

	@Override
	public void performSpecialAction() {
		if(!this.missile) return;
		this.missile = false;
		this.stop();
		
		Vehicule target = board.get(new Random().nextInt(this.board.size()));
		
		if (this.board.size() == 1) {
			return;
		}
		if (target == this) {
			this.performSpecialAction();
		}
		
		if (target instanceof Tank) {
			target.stop();
		} else {
			target.destroy();
		} 
		
		System.out.println("SHBOOM...IIIIIIIIIOOOOOOOOOOOOOOOOOOOONNNNNNNNNNNNN... KABOOOOOOM !! :D");
	}

}
