package Kata_Mars_Rover_R3.unilim.fr.Model;

public class Grid {
	int width;
	int height;
	
	public Grid(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public Grid() {
		this.width=10;
		this.height=10;
	}
	public void ShowGrid(Rover rover) {
		for (int Line = 0; Line < height; Line++) {
			for (int Column = 0; Column < width; Column++) {
				if ((rover.getX()==Line) && (rover.getY()==Column)) {
					System.out.print("*");
					System.out.print("|");
				}
				else {
					System.out.print("-");
					System.out.print("|");
				}
			}
			System.out.println();
			}
	}
	
}
