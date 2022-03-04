/* runs multiple lights together in sync
 * 
 */
public class Intersection {
	
	private String name;
	private TrafficLight northIntersection;
	private TrafficLight southIntersection;
	private TrafficLight eastIntersection;
	private TrafficLight westIntersection;
	
	public Intersection() {
		name = null;
		
		northIntersection = new TrafficLight();
		southIntersection = new TrafficLight();
		eastIntersection = new TrafficLight();
		westIntersection = new TrafficLight();
		
	}
	
	
public Intersection(String name) {
	this();
	this.name = name;
}

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

public void stopTraffic() {
	northIntersection.setRedWhen();
	southIntersection.setRedWhen();
	eastIntersection.setRedWhen();
	westIntersection.setRedWhen();
	
}

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

	
	
}

