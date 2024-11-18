package Kata_Mars_Rover_R3.unilim.fr;

public class East extends Direction{

	public East() {
		this.direction="East";
	}
	public int Forward(int distance,int position) {
		return distance+position;
	}

}
