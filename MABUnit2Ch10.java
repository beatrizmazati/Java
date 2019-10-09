/******************************************************************************************
 * MABUnit2Ch10.java
 * Beatriz Mazati Anderson
 * 
 * This program uses array lists and generates random number between 1 and 100. 
 * Then allows you to search for matching values. Output is printed for a sorted 
 * and unsorted list. 
 ******************************************************************************************/

import java.util.*; //imports all of the classes! 

public class MABUnit2Ch10
{
  public static void main(String [] args)
  {
	Scanner stdIn = new Scanner (System.in);
	int randomInteger;  // the random number that is generated and added to the ArrayList
	int sum = 0;            // adds all of the integers randomly generated
	int numberToLocate; // number the user wants to locate
	int randomNumberCount; // the number of random numbers that user wants to add to the ArrayList
	Random rand = new Random(); // generates Random Numbers
	
	ArrayList<Integer> RandomList = new ArrayList<>(); // declared an ArrayList of random numbers
		
	System.out.print("How many random numbers between 1 and 100: "); //input for how many numbers to use
	randomNumberCount = stdIn.nextInt();
	
	for(int i=0; i<randomNumberCount; i++) // "for loop”, adding random numbers to the array list between 1 and 100. 
	{
      randomInteger = rand.nextInt(100 - 0 + 1) + 0; // generate a random number from 1-100
      RandomList.add(randomInteger); // add that number to the list
      sum += randomInteger;
	}
	
	
	System.out.print("Which random number are you searching for?: "); // get input to be searched
	numberToLocate = stdIn.nextInt();
	
	int unsortedIndex = 0; // create an index to assist with the for-each loop and sequential search
	System.out.print("\nUnsorted List\n"); // mimics the sample - output the list title
	
	for (int num : RandomList) // for-each loop
	{
		if (num == numberToLocate)
	  if (RandomList.get(unsortedIndex) == numberToLocate) // finishes sequential search
		  
	    System.out.println(numberToLocate + " found at location: " + unsortedIndex); // outputs the location found and mimics sample
	
	   unsortedIndex++;
	   
	 }
	
		Collections.sort(RandomList);
		
		
		int sortedIndex = 0; // // create an index to assist with the for-each loop and sequential search
		System.out.print("\nSorted List\n"); // mimics the sample - output the list title
		
		for (int num : RandomList) // for-each loop
		{
			if (num == numberToLocate)
		if (RandomList.get(sortedIndex) == numberToLocate) // finishes sequential search
			
		System.out.println(numberToLocate + " found at location: " + sortedIndex); // // outputs the location found and mimics sample
		
		
		sortedIndex++;
			
		}
	
	System.out.print("\nTotal of all numbers: " + sum); // prints the sum of all random numbers stored in randomNumberCount
	
  }
  }
