package facade;

public class ComputerFacade {
	private static final long BOOT_ADDRESS = 3;
	private static final long BOOT_SECTOR = 3;
	private static final int SECTOR_SIZE = 18;
	private final CPU processor;
	
	private final Memory ram;
	private final HardDrive hd;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}

	public void start() {
		processor.freeze();
	    ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
	    processor.jump(BOOT_ADDRESS);
	    processor.execute();
	}
}
