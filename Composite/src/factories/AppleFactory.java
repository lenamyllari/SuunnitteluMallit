package factories;

import ComputerParts.Case;
import ComputerParts.GraphicsCard;
import ComputerParts.KeyBoard;
import ComputerParts.Monitor;
import ComputerParts.MotherBoard;
import ComputerParts.PowerSupply;
import ComputerParts.Processor;
import ComputerParts.RamModules;

public class AppleFactory implements ComputerFactory{

	@Override
	public Processor makeProcessor() {
		Processor processor = new Processor(500);
		return processor;
	}

	@Override
	public MotherBoard makeMotherBoard() {
		MotherBoard motherBoard = new MotherBoard(500);
		motherBoard.addPart(makeRamModules());
		motherBoard.addPart(makeProcessor());
		motherBoard.addPart(makeGraphicsCard());
		return motherBoard;
	}

	@Override
	public RamModules makeRamModules() {
		RamModules ramModules = new RamModules(500);
		return ramModules;
	}

	@Override
	public PowerSupply makePowerSupply() {
		PowerSupply powerSupply = new PowerSupply(500);
		return powerSupply;
	}

	@Override
	public Case makeCase() {
		Case casee = new Case(500);
		casee.addPart(makeMotherBoard());
		casee.addPart(makePowerSupply());
		return casee;
	}

	@Override
	public Monitor makeMonitor() {
		Monitor monitor = new Monitor(500);
		return monitor;
	}

	@Override
	public GraphicsCard makeGraphicsCard() {
		GraphicsCard graphicsCard = new GraphicsCard(500);
		return graphicsCard;
	}

	@Override
	public KeyBoard makeKeyBoard() {
		KeyBoard keyBoard = new KeyBoard(500);
		return keyBoard;
	}

}
