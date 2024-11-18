package Kata_Mars_Rover_R3.unilim.fr;

public class West extends Direction {

	public West() {
		this.direction="West";
	}
	public int Forward(int distance,int position) {
		return distance-position;
	}
}
