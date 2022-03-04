/*  Controls one of the Traffic Lights 
 *Justin Wells
 *  Intro to Java
 * 2/3/2022
 */

public class TrafficLight {
	// traffic Light Controller class
	
	private boolean red; // color red
	private boolean green; // color green
	private boolean yellow; // color yellow 
	
	private static final String Reset = "\033[0m"; // actually displays the colors
	private static final String Red = "\033[31;7m";
	private static final String Green = "\033[32;7m";
	private static final String Yellow = "\033[33;7m";
	
public TrafficLight() { 
	this.green = false; 
	this.yellow = false;
	this.red = true;
}

public boolean isRed() { // sets isRed to the color red
	return red;
}

public void setRedWhen() { // sets the traffic light only red
	this.green = false;
	this.yellow = false;
	this.red = true; 

	}
public boolean isYellow() { // sets isYellow to the color Yellow
	return yellow;
	}
public void setYellowWhen () { // sets traffic light to only red
	this.green = false;
	this.yellow= true;
	this.red = false; 
	}

public boolean isGreen() { // assigns isGreen to the color green
	return green;
	}
public void setGreenWhen() { // sets traffic light to only green
	this.green = true;
	this.yellow = false;
	this.red = false;
	}


public void showLight() {
	if(red)
		System.out.println(Red + "Red" + Reset);
	else if (yellow)
		System.out.println(Yellow + "Yellow" + Reset);
	else if (green)
		System.out.println(Green + "Green" + Reset);
	else
		System.out.println( "All Lights are Off");
		
}


}
