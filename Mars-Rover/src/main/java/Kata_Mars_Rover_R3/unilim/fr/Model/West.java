package Kata_Mars_Rover_R3.unilim.fr.Model;

public class West extends Direction {

	public West() {
		this.direction="West";
	}
	public void Forward(int distance) {
		rover.movementOnY(-distance);
	}
}
