/*********************************************************************************************************************************************
 * *MABUnit5Ch14.java
 *
 * Beatriz Mazati Anderson
 *
 * This is a Pizza ordering system using Polymorphism. The setCrust method varies based on which type of Pizza is instantiated.
 * This program is also the driver for the MABPizza.java and MABCheese.java classes, since it creates objects and manipulates them. (pg 221)
 **********************************************************************************************************************************************/
import java.util.Scanner;

public class MABUnit5Ch14 
{
	public static void main(String[] args)
	{
	  Scanner scan = new Scanner(System.in);
	  String cheeseOrMeatPizza;
	  String crust;
	  String ingredient;
	
	  System.out.print("What type of pizza would you like <Cheese or Meat>: "); // Get input for Cheese or Meat pizza
	  cheeseOrMeatPizza = scan.nextLine(); // Declare a single pizza to be used for both Cheese and Meat - also got user input stored
    
	  // If a Meat pizza is selected 
	  if (cheeseOrMeatPizza.equalsIgnoreCase("meat"))
	  {
		  MABPizza pizza = new MABPizza();
		  // setType to Meat via the constructor
		  System.out.print("Thin or thick crust: ");
		  crust = scan.nextLine();
		  pizza.setCrust(crust);
		  System.out.print("What ingredient, sorry only 1: ");
          ingredient = scan.nextLine();
          pizza.setIngredients(ingredient);
          pizza.setCost();
          
          System.out.println("\nYou ordered: ");
          System.out.println("Meat Pizza");
          System.out.println(ingredient + " (+2.00)");
          System.out.println(crust + " crust");
          System.out.println("Total cost of $7.00");
	  }
	 
	  else
	  {
		// instantiate your pizza as a MABPizza pizza with zero arguments
		 MABCheese pizza = new MABCheese();
		 // output here like sample??
		 System.out.println("\nYou ordered: ");
		 System.out.println("Cheese Pizza");
		 System.out.println("Thin crust");
		 System.out.println("Total cost of $5.00");
	  }
	  
	} // end main
} // end class MABUnit5Ch14
