package factories;

import ComputerParts.Case;
import ComputerParts.GraphicsCard;
import ComputerParts.KeyBoard;
import ComputerParts.Monitor;
import ComputerParts.MotherBoard;
import ComputerParts.PowerSupply;
import ComputerParts.Processor;
import ComputerParts.RamModules;

public interface ComputerFactory {
	public abstract Processor makeProcessor();
	public abstract MotherBoard makeMotherBoard();
	public abstract RamModules makeRamModules();
	public abstract PowerSupply makePowerSupply();
	public abstract Case makeCase();
	public abstract Monitor makeMonitor();
	public abstract GraphicsCard makeGraphicsCard();
	public abstract KeyBoard makeKeyBoard();
}
