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
		for (int cpt = 0; cpt < height; cpt++) {
			for (int cpt1 = 0; cpt1 < width; cpt1++) {
				if ((rover.getX()==cpt) && (rover.getY()==cpt1)) {
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
