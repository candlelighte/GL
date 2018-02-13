package application.main.pckg;

import templatemethod.pckg.GlassHouse;
import templatemethod.pckg.HouseTemplate;
import templatemethod.pckg.WoodenHouse;

public class ApplicationTemplateMethod {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		//using template method
		houseType.buildHouse();
		System.out.println("************");
		houseType = new GlassHouse();
		houseType.buildHouse();
	}

}
