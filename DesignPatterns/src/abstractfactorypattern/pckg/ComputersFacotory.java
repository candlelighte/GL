package abstractfactorypattern.pckg;

import entity.pckg.Computer;

public class ComputersFacotory {
	
	/**
	 * consumer class that will provide the entry point for the
	 * client classes to create sub-classes
	 * */
	
	public static Computer getCompter( ComputerAbstractFactory factory ) {
		return factory.createComputer();
	}
}
