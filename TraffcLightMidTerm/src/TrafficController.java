
public class TrafficController {

	private final static String doubleLine = "======================";
	private final static String singline  =   "----------------------";
	
	private Intersection firstIntersection;
	private Intersection secondIntersection; 
	
	
	public TrafficController() {
		firstIntersection = new Intersection("first");
		secondIntersection = new Intersection("second");
			
	}
	private void SwitchAll() {
		firstIntersection.switchTraffic();
		secondIntersection.switchTraffic();
		
	}
	
	private void stopAll() {
		firstIntersection.stopTraffic();
		secondIntersection.switchTraffic();
	}
	
	private void DisplayAll() {
		firstIntersection.displayLights();
		System.out.println();
		secondIntersection.displayLights();
		
	}
	
	private int getMenuChoices() {
		System.out.println(doubleLine);
		System.out.println("The Traffic Light Controller");
		System.out.println(doubleLine);
		System.out.println("0 = exit");
		System.out.println("1 = Switch");
		System.out.println("2 = Shutdown");
		return Input.getIntRange("Menu Choice: ",0, 2);
		
	}
	
	private void ControlTraffic() {
		boolean playGame = true;
		int userInput = 4;
		
		while(userInput != 0) {
			userInput = getMenuChoices();
			switch (userInput) {
			case 0:
				System.out.println("Traffic Control Simulation Ended");
				break;
			case 1:
			SwitchAll();
			System.out.println();
			DisplayAll();
			break;
			
			case 2:
			stopAll();
			System.out.println();
			DisplayAll();
			break;
			
			default:
			System.out.println("How did you get here?");
		
			
			
			}
		}
	}
	
	public static void main(String[] args) {
		TrafficController app = new TrafficController();
		app.ControlTraffic();
		Input.sc.close();
		
	light1.setYellowWhen();
	light1.displayLight();
	light1.setGreenWhen();
	light1.displayLight();
	light1.setRedWhen();
	light1.displayRed();
	
		
	}
}

