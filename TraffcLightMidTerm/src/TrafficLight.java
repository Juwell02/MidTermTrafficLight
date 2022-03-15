/**
 * determines the colors and controls each individual traffic light
 * 
 * @author juwell01
 * @since 2022.03.14
 * @version 1.0 
 */
public class TrafficLight {
	// traffic Light Controller class

	private boolean red; // color red
	private boolean green; // color green
	private boolean yellow; // color yellow 

	private static final String RESET = "\033[0m"; // actually displays the colors
	private static final String RED = "\033[31;7m";
	private static final String GREEN = "\033[32;7m";
	private static final String YELLOW = "\033[33;7m";

	public TrafficLight() {  // displays only one color at a time. 
		this.green = false; 
		this.yellow = false;
		this.red = true;
	}

	public boolean isRed() { // sets isRed to the color red
		return red;
		
	}

	public void setRedOn() { // sets the traffic light only red
		this.green = false;
		this.yellow = false;
		this.red = true; 

	}
	
	public boolean isYellow() { // sets isYellow to the color Yellow
		return yellow;
		
	}
	
	public void setYellowOn () { // sets traffic light to only red
		this.green = false;
		this.yellow= true;
		this.red = false; 
	}

	
	public boolean isGreen() { // assigns isGreen to the color green
		return green;
		
	}
	
	public void setGreenOn() { // sets traffic light to only green
		this.green = true;
		this.yellow = false;
		this.red = false;
	}

	public void showLight() { // displays the lights colors
		if(red)
			System.out.println(RED + "red" + RESET);
		else if (yellow)
			System.out.println(YELLOW + "yellow" + RESET);
		else if (green)
			System.out.println(GREEN + "green" + RESET);
		else
			System.out.println( "All lights are off");

	}


} // end of TraffifLight
