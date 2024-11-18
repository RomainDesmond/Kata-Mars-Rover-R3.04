package Kata_Mars_Rover_R3.unilim.fr;

public class Rover {
	int x;
	int y;
	Direction direction;
	
	public Rover() {
		this.x=0;
		this.y=0;
		this.direction=new North();
	}
	
	public String ShowDirectionRover() {
		return direction.ShowDirection();
	}
	public void Movement() {
		
	}
}
