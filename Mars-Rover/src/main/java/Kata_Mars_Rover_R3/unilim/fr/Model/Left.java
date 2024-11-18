package Kata_Mars_Rover_R3.unilim.fr.Model;

public class Left implements Command{
	Rover rover;
	public Left(Rover rover) {
		this.rover=rover;
	}
	@Override
	public void execute() {
		rover.turnOnTheLeft();
	}

}
