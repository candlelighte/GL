package application.main.pckg;

import bridgedesign.pckg.GreenColor;
import bridgedesign.pckg.Pentagon;
import bridgedesign.pckg.RedColor;
import bridgedesign.pckg.Shape;
import bridgedesign.pckg.Triangle;

public class ApplicationBridge {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
