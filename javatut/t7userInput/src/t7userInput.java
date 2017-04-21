import java.util.Scanner;


public class t7userInput {
	public static void main(String[] args){
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt...You don't actually need this
		// but it is good to have otherwise user doesn't know
		//what to do.
				System.out.println("Enter a line of text: ");
		
		//wait for hte user to enter a line of text
		String line = input.nextLine();
		
		//Tell them what htey entered
		System.out.println("You entered: " + line);
	}
}
