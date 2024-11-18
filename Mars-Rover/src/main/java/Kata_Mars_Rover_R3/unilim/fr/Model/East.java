package Kata_Mars_Rover_R3.unilim.fr.Model;

public class East extends Direction{

	public East() {
		this.direction="East";
	}
	public void Forward(int distance) {
		rover.movementOnY(distance);
	}

}
