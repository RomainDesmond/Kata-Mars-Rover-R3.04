package Kata_Mars_Rover_R3.unilim.fr.Model;

public class North extends Direction{

	public North() {
		this.direction="North";
	}
	public void Forward(int distance) {
		rover.movementOnX(distance);
	}

}
