package chainOfResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager(); 
		DepartmentChief depChief = new DepartmentChief();
		ExecutiveDirector director = new ExecutiveDirector();  
		manager.setSuccessor(depChief); 
		depChief.setSuccessor(director); 

		// Press Ctrl+C to end. 
		try { 
			while (true) { 
				System.out.println("Enter your present salary."); 
				System.out.print(">"); 
				double s = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				System.out.println("Enter the amount to check who should approve your payrise resquest."); 
				System.out.print(">"); 
				double r = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine()); 
				manager.processRequest(new PayRiseRequest(r,s)); 
				} 
			} catch(Exception e) { 
				System.exit(1); 
				}

	}

}
