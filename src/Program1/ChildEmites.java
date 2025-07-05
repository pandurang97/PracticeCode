package Program1;

import Pyramid.parentAirCraft;

public class ChildEmites extends parentAirCraft {

	public static void main(String[]args) {
		ChildEmites c = new ChildEmites();
		c.engine();
		c.saftGuidlines();
		c.bodyColor();
	}
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}
	

	
}
