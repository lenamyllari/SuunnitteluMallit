package facade;

public class CPU {
	private long position;
	
	 public void freeze() { 
	    System.out.println("Freezing processor.");
	 }
	 
	 public void jump(long position) { 
		 this.position = position;
		 System.out.println("Jumping to:" + position);	
	 }
	 
	 public void execute() { 
		 System.out.println("Executing.");
	 }
}
