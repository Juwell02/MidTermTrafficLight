/**
 * Controls the traffic lights as a whole
 * 
 * @author juwell01
 * @since 2022.03.14
 * @version 1.0 
 */

public class TrafficController {

	// sets double line to "="
	private final static String doubleLine = "======================";
	private final static String singleline  =   "----------------------"; 
	// sets single line to "-"

	// names the intersections
	private Intersection intersection1; 
	private Intersection intersection2; 

	// distinguishes the two different intersections as first and second
	public TrafficController() {
		intersection1 = new Intersection("Doge");
		intersection2 = new Intersection("Hansen");
		
	}
	
	// switches switch a
	private void SwitchAll() {
		intersection1.switchTraffic();
		intersection2.switchTraffic();
		
	}
	
	// stops switch a
	private void stopAllLights() {
		intersection1.stopTraffic();
		intersection2.stopTraffic();
		
	}
	
	// displays the switch
	private void displayAll() {
		intersection1.displayLight();
		System.out.println();
		intersection2.displayLight();
		
	}
	
	// displays the menu with the 3 choices for users
	private int getMenuChoices() {
		System.out.println(doubleLine);
		System.out.println("The Traffic Light Controller");
		System.out.println(doubleLine);
		System.out.println("0 = exit");
		System.out.println("1 = Switch");
		System.out.println("2 = Shutdown all lights");
		return Input.getIntRange("Menu Choice: ",0, 2);
		// returns the users selection
	
	}
	
	private void ControlTraffic() {

		int userInput = -1;

		while(userInput != 0) { // continues running the game as longer as input isn't zero
			userInput = getMenuChoices();
			switch (userInput) {
			case 0: // ends the simulation
				System.out.println("Traffic Control Simulation Ended");
				break; 
			case 1://switches all the lights
				SwitchAll(); 
				System.out.println();
				displayAll();
				break;

			case 2:
				stopAllLights(); // stops all the lights 
				System.out.println();
				displayAll();
				break;

			default:
				System.out.println("Invalid Input please enter a valid number");

			}
		}
	}

	//runs everything through the main
	public static void main(String[] args) {
		TrafficController app = new TrafficController();
		app.ControlTraffic();
		Input.sc.close();





	}
}
// end of main
