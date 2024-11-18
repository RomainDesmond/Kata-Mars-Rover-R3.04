package Kata_Mars_Rover_R3.unilim.fr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoverTest {
	Rover rover;
	
	@Test
	void Test_Direction() {
		rover=new Rover();
		assertEquals("The rover direction is North", rover.ShowDirectionRover());
	}
}
