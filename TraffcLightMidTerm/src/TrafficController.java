
public class TrafficController {

	// sets double line to "="
	private final static String doubleLine = "======================";
	private final static String singline  =   "----------------------"; 
	// sets single line to "-"

	// names the intersections
	private Intersection firstIntersection; 
	private Intersection secondIntersection; 
	
	// distinguishes the two different intersections as first and second
	public TrafficController() {
		firstIntersection = new Intersection("first");
		secondIntersection = new Intersection("second");
			
	}
	// switches switch a
	private void SwitchAll() {
		firstIntersection.switchTraffic();
		secondIntersection.switchTraffic();
		
	}
	// stops switch a
	private void stopAll() {
		firstIntersection.stopTraffic();
		secondIntersection.stopTraffic();
	}
	// displays the switch
	private void DisplayAll() {
		firstIntersection.displayLight();
		System.out.println();
		secondIntersection.displayLight();
		
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
	//  
	private void ControlTraffic() {
		
		// options while simulation is in play
		boolean playGame = true; // while simulation is being played
		int userInput = 4;
		
		while(userInput != 0) { // continues running the gams as longer as input isn't zero
			userInput = getMenuChoices();
			switch (userInput) {
			case 0: // ends the simulation
				System.out.println("Traffic Control Simulation Ended");
				break; 
			case 1:// switches all the lights
			SwitchAll(); 
			System.out.println();
			DisplayAll();
			break;
			
			case 2:
			stopAll(); // stops all the lights 
			System.out.println();
			DisplayAll();
			break;
			
			default:
			System.out.println("How did you get here?");
		
			
			
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
