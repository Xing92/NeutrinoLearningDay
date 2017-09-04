package factory;

public class Computer implements Machine{

	private int ram;
	private int volumeSize;
	
	public Computer(int ram, int volumeSize) {
		this.ram = ram;
		this.volumeSize = volumeSize;
	}

	@Override
	public int getRam() {
		return ram;
	}

	@Override
	public int getVolumeSize() {
		return volumeSize;
	}
		
	public String getName(){
		return "Computer";
	}

}
