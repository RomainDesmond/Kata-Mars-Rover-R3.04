package Kata_Mars_Rover_R3.unilim.fr;

public class North extends Direction{

	public North() {
		this.direction="North";
	}
	public int Forward(int distance,int position) {
		return distance+position;
	}

}
