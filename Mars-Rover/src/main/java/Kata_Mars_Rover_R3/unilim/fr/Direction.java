package Kata_Mars_Rover_R3.unilim.fr;

public abstract class Direction {
	String direction;
	Direction right;
	Direction left;
	public String ShowDirection() {
		return "The rover direction is "+direction;
	}
	public void setRight(Direction right) {
		this.right=right;
	}
	
	public void setLeft(Direction left) {
		this.left=left;
	}
	
	public Direction getRight() {
		return right;
	}
	public Direction getLeft() {
		return left;
	}

	
}
