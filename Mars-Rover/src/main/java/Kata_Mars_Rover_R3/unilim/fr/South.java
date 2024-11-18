package Kata_Mars_Rover_R3.unilim.fr;

public class South extends Direction{

	public South() {
		this.direction="South";
	}
	public int Forward(int distance,int position) {
		return distance-position;
	}

}
