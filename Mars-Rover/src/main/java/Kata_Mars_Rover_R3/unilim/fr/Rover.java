package Kata_Mars_Rover_R3.unilim.fr;

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
		
	}
	
	public String ShowDirectionRover() {
		return direction.ShowDirection();
	}
	public void Movement() {
		
	}
	
	public void ChangingDirectionRight() {
		direction=direction.getRight();
	}
	public void ChangingDirectionLeft() {
		direction=direction.getLeft();
	}
	public String ShowPosition() {
		return "The position is x: "+x+" y: "+y;
	}
}
