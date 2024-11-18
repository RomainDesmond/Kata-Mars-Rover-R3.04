package Kata_Mars_Rover_R3.unilim.fr.Model;

public class Right implements Command{
	Rover rover;
	public Right(Rover rover) {
		this.rover=rover;
	}
	@Override
	public void execute() {
		rover.turnOnTheRight();
	}

}
