import java.util.Scanner;

// deals with all inputs from the user

public class Input {
	// scanner used for inputs
	public static Scanner sc = new Scanner(System.in);
	// get line prompt displays a prompt to get the users information
	public static String getLine(String prompt) {

		System.out.print(prompt);
		return sc.nextLine();
	}

	public static int getInt(String prompt) {
		int userInput = 0;

		System.out.print(prompt);

		while (true) {
			if(sc.hasNextInt()) // if the number entered is valid
				break; // breaks out of the lop 
			System.out.printf("Invalid Input, enter a number: "); // prompting the user to enter a valid number
			sc.next(); // empties out the buffer
		} // end of while


		userInput = sc.nextInt();
		sc.nextLine();

		return userInput;

	} // end of getInt

	public static int getIntRange(String prompt, int low, int high) {
		int userInput;

		System.out.print(prompt);

		while(true) {
			if(sc.hasNextInt()) { // if the number entered is valid
				userInput = sc.nextInt(); // puts the integer in userInput


				// sets desired range
				if(userInput >= low && userInput <= high) {
					break; // breaks out of loop
				}
			}else {
				sc.next(); // cleans out the buffer
			} // end of else if
			System.out.printf("Invalid input! Pleasde Enter a number");

		} // end of while
		sc.nextLine();
		return userInput;
	} // end of getIntRange
} // end of input

