/**
 * runs the traffic lights together in sync
 * 
 * @author juwell01
 * @since 2022.03.14
 * @version 1.0 
 */
public class Intersection {

	
	private TrafficLight north;
	private TrafficLight south;
	private TrafficLight east;
	private TrafficLight west;
	private String name;
	
	
	// the intersections class
	public Intersection() {
		name = null;

		// assigning names to each traffic light
		north = new TrafficLight();
		south = new TrafficLight();
		east = new TrafficLight();
		west = new TrafficLight();

	}

	// public class for the intersections 
	public Intersection(String name) {
		this();
		this.name = name;
		
	}
	
	// switches the traffic lights
	public void switchTraffic() {
		if(north.isGreen() == true) {
			north.setYellowOn();
			south.setYellowOn();
			east.setRedOn();
			west.setRedOn();
			
		}
		
		else if (north.isYellow() == true) {
			north.setRedOn();
			south.setRedOn();
			east.setGreenOn();
			west.setGreenOn();
			
		}

		else if (north.isRed() == true) {
			north.setGreenOn();
			south.setGreenOn();
			east.setRedOn();
			west.setRedOn();

		}

		else {
			north.setRedOn();
			south.setRedOn();
			east.setGreenOn();
			west.setGreenOn();
			
		}
	}
	
	// turns all the traffic lights to red
	public void stopTraffic() {
		north.setRedOn();
		south.setRedOn();
		east.setRedOn();
		west.setRedOn();

	}
	
	// displays what lights are what colors
	public void displayLight() {
		System.out.println(name);
		System.out.print( "North Intersection is ");
		north.showLight();
		System.out.print( "South Intersection is ");
		south.showLight();
		System.out.print( "East Intersection is ");
		east.showLight();
		System.out.print( "West Intersection is ");
		west.showLight();


	}



} // of of Intersection 

