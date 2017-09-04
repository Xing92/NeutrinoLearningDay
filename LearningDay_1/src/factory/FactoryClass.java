package factory;

public class FactoryClass {

	public enum MachineType {
		COMPUTER, SERVER
	}

	public static Machine getMachine(MachineType machine, int ram, int volumeSize) {
		if (machine == MachineType.COMPUTER) {
			return new Computer(ram, volumeSize);
		} else if (machine == MachineType.SERVER) {
			return new Server(ram, volumeSize);
		} else {
			return null;
		}
	}

}
