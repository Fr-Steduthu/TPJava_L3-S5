package tp1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class World {
	public static final Location SIZE = new Location(10,10);
	private static Location[] board;
	
	private Map<Location, Robot> robots= new HashMap<>();
	private List<Location> freeSpaces = new ArrayList<>();
	
	static {
		World.board = getLocations();
	}
	
	public World(){
		for(Location l : World.board) {
			this.freeSpaces.add(l);
		}
	}
	
	public Location locate(Robot r) {
		for(Entry<Location, Robot> entry : this.robots.entrySet()) {
			if(entry.getValue() == r) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	public boolean hasRobotAtLocation(Location l) {
		for(Entry<Location, Robot> entry : this.robots.entrySet()) {
			if(entry.getKey() == l) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public void killRobot(Robot r) {
		Location robotPos = this.locate(r);
		this.robots.remove(robotPos);
		this.freeSpaces.add(robotPos);
	}
	
	public void addRobot(String name) {
		Location l = World.pickRandomLocation();
		Robot r = new Robot(name);
		
		System.out.println(l);
		
		if(this.hasRobotAtLocation(l)) {
			this.killRobot(this.robots.get(l));
		}else {

			this.freeSpaces.remove(l);
		}
		
		this.robots.put(l, r);
	}
	
	
	
	
	public Robot getRandomRobot() {
		return this.robots.get(this.getRandomRobotLocation());
	}
	
	public Location getRandomRobotLocation() {

		for(Entry<Location, Robot> e : this.robots.entrySet()) {
			if(Math.random() <= 1/this.robots.size()) {
				return e.getKey();
			}
		}
		
		for(Entry<Location, Robot> e : this.robots.entrySet()) {
			return e.getKey();
		}
		
		return null;
	}
	
	public void moveRobot() {
		Location orgn = this.getRandomRobotLocation();
		Robot r = this.robots.get(orgn);
		this.robots.remove(orgn);
		this.freeSpaces.add(orgn);
		
		Location l = World.pickRandomLocation();
		if(this.hasRobotAtLocation(l)) {
			this.killRobot(this.robots.get(l));
		}
		this.robots.put(l, r);
		this.freeSpaces.remove(l);
	}
	
	
	public void display() {
		for(Entry<Location, Robot> e : this.robots.entrySet()) {
			System.out.println(e.getValue() + " : " + e.getKey());
			//System.out.println(this.robots);
		}
	}
	
	
	/*STATIC METHODS*/
	public static Location[] getLocations() {
		Location[] out = new Location[World.SIZE.x * World.SIZE.y +10];
		
		for(int i = 0; i < World.SIZE.x; i++) {
			for(int j = 0; j < World.SIZE.y; j++) {
				out[i * World.SIZE.x + j] = new Location(i,j);
			}
		}
		
		return out;
	}
	
	public static Location pickRandomLocation() {
		return World.board[(int) (Math.random() * World.SIZE.x * World.SIZE.y +1)];
		
	}
	
	/*Main*/
	public static void main(String args[]) {
		World w = new World();
		
		w.addRobot("N°1");
		w.addRobot("Lavos");
		w.addRobot("Billy");
		w.display();
		System.out.println("---");
		w.moveRobot();
		w.moveRobot();
		w.moveRobot();
		w.display();
	}
}

