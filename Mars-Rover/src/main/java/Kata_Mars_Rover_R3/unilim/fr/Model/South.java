package Kata_Mars_Rover_R3.unilim.fr.Model;

public class South extends Direction{

	public South() {
		this.direction="South";
	}
	public void Forward(int distance) {
		rover.movementOnX(-distance);
	}

}
