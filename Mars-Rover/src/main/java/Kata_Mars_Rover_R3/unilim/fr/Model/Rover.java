package Kata_Mars_Rover_R3.unilim.fr.Model;

public class Rover {
	int x;
	int y;
	Direction direction;
	
	
	public Rover() {
		this.x=0;
		this.y=0;
		this.direction=new North();
		Direction south=new South();
		Direction east=new East();
		Direction west=new West();
		
		direction.setRight(east);
		direction.setLeft(west);
		south.setRight(west);
		south.setLeft(east);
		east.setRight(south);
		east.setLeft(direction);
		west.setRight(direction);
		west.setLeft(south);
		
		direction.setRover(this);
		south.setRover(this);
		east.setRover(this);
		west.setRover(this);
		
	}
	
	public String ShowDirectionRover() {
		return direction.ShowDirection();
	}
	public void Movement(int distance) {
		direction.Forward(distance);
	}
	
	public void turnOnTheRight() {
		direction=direction.getRight();
	}
	public void turnOnTheLeft() {
		direction=direction.getLeft();
	}
	public String showPosition() {
		return "The position is x: "+x+" y: "+y;
	}
	public void movementOnX(int distance) {
		this.x=x+distance;
	}
	public void movementOnY(int distance) {
		this.y=y+distance;
	}
}
