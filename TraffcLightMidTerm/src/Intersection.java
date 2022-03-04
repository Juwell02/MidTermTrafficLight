/* runs multiple lights together in sync
 * 
 */
public class Intersection {
	
	private String name;
	private TrafficLight northIntersection;
	private TrafficLight southIntersection;
	private TrafficLight eastIntersection;
	private TrafficLight westIntersection;
	
	
	// the intetsections class
	public Intersection() {
		name = null;
		
		// assigning names to each traffic light
		northIntersection = new TrafficLight();
		southIntersection = new TrafficLight();
		eastIntersection = new TrafficLight();
		westIntersection = new TrafficLight();
		
	}
	
	// public class for the intersections 
public Intersection(String name) {
	this();
	this.name = name;
}
// switches the traffic lights
public void switchTraffic() {
	if(northIntersection.isGreen() == true) {
		northIntersection.setYellowWhen();
		southIntersection.setYellowWhen();
		eastIntersection.setRedWhen();
		westIntersection.setRedWhen();
	}
	else if (northIntersection.isRed() == true) {
		northIntersection.setGreenWhen();
		southIntersection.setGreenWhen();
		eastIntersection.setRedWhen();
		westIntersection.setRedWhen();	
	}
	
	else if (northIntersection.isYellow()== true) {
		northIntersection.setRedWhen();
		southIntersection.setRedWhen();
		eastIntersection.setGreenWhen();
		westIntersection.setGreenWhen();
		
	}
	
	else {
		northIntersection.setRedWhen();
		southIntersection.setRedWhen();
		eastIntersection.setGreenWhen();
		westIntersection.setGreenWhen();
	}
}
// turns all the traffic lights to red
public void stopTraffic() {
	northIntersection.setRedWhen();
	southIntersection.setRedWhen();
	eastIntersection.setRedWhen();
	westIntersection.setRedWhen();
	
}
// displays what lights are what colors
public void displayLight() {
	System.out.println(name);
	System.out.print("North Intersection is ");
	northIntersection.showLight();
	System.out.print("South Intersection is ");
	southIntersection.showLight();
	System.out.print("East Intersection is ");
	eastIntersection.showLight();
	System.out.print("West Intersection is ");
	westIntersection.showLight();
	
	
}

	
	
} // of of Intersection 

