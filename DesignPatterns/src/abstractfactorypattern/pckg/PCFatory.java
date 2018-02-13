package abstractfactorypattern.pckg;

import entity.pckg.Computer;
import entity.pckg.PC;

public class PCFatory implements ComputerAbstractFactory {
	
	
	private String ram;
	private String hdd;
	private String cpu;
	

	public PCFatory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu );
	}

}
