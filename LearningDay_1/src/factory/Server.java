package factory;

public class Server implements Machine {

	private int ram;
	private int volumeSize;
	
	public Server(int ram, int volumeSize) {
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


}
