/*  Controls one of the Traffic Lights 
 *Justin Wells
 *  Intro to Java
 * 2/3/2022
 */

public class TrafficLight {
	
	
	private boolean red;
	private boolean green;
	private boolean yellow;
	
	private static final String Reset = "\033[0m";
	private static final String Red = "\033[31;7m";
	private static final String Green = "\033[32;7m";
	private static final String Yellow = "\033[33;7m";
	
public TrafficLight() {
	this.green = false; 
	this.yellow = false;
	this.red = true;
}

public boolean isRed() {
	return red;
}

public void setRedWhen() {
	this.green = false;
	this.yellow = false;
	this.red = true; 

	}
public boolean isYellow() {
	return yellow;
	}
public void setYellowWhen () {
	this.green = false;
	this.yellow= true;
	this.red = true; 
	}

public boolean isGreen() {
	return green;
	}
public void setGreenWhen() {
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
