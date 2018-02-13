package application.main.pckg;

import abstractfactorypattern.pckg.ComputersFacotory;
import abstractfactorypattern.pckg.PCFatory;
import abstractfactorypattern.pckg.ServerFactory;
import entity.pckg.Computer;

public class ApplicationAbstractFactoryPattern {

	public static void main(String[] args) {
		Computer pc = ComputersFacotory.getCompter( new PCFatory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputersFacotory.getCompter( new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		
		System.out.println( "AbstractFactory PC Config:: " + pc );
		System.out.println( "AbstractFactory Server Config:: " + server );
	}

}
