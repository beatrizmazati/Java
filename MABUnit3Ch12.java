/***************************************************************************************************************************
 *MABUnit3Ch12.java
 * Beatriz Mazati Anderson 
 *
 * This program gets input for a string, then output the initial character, ASCII values of the character 
 * and number, and hex values of each character.
 **************************************************************************************************************************/
import java.util.*; //imports all of the classes! 

public class MABUnit3Ch12 
{
	public static void main(String [] args)
	  {
		Scanner stdIn = new Scanner (System.in);
		final String HEADING_FMT_STR = "%-10s%-16s%-16s%5s\n";
		final String DATA_FMT_STR = "%-9s%-17s%-17s%-5s\n";
		String userInput; // string containing both numbers and letters of any length

		
		System.out.print("Please enter a string of any length: "); // get input for a string containing both numbers and letters of any length
		userInput = stdIn.nextLine();
		
		System.out.printf(HEADING_FMT_STR, "\nInitial", "ASCII<char>", "ASCII<int>", "Hex");
		
	
		
		for(int i=0; i<userInput.length(); i++) // uses a for loop with postfix notation to increment through the string
		{
			int ascii = (int) userInput.charAt(i);
			if (Character.isDigit(userInput.charAt(i)) == true) // isDigit method tip was very useful, thank you!
			{
				System.out.printf(DATA_FMT_STR, userInput.charAt(i),"", ascii, Integer.toHexString(ascii).toUpperCase()); // prints ASCii <int>
			}
			else
			{
				System.out.printf(DATA_FMT_STR, userInput.charAt(i), ascii, "", Integer.toHexString(ascii).toUpperCase()); // prints ASCII <char>
			}
			
	    } // end for
		
		System.out.print("\nThank you for playing!"); // output “Thank you for playing!” 
	
	  } // end main
} // end class MABUnit3Ch12 
