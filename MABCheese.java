/**********************************************************************************************************************************
 * *MABCheese.java
 * 
 * Beatriz Mazati Anderson
 *
 *This represents an order for a cheese pizza. This class also extends MABPizza.java class, becoming a subclass.
 ***********************************************************************************************************************************/

public class MABCheese extends MABPizza
{
	private String pizzaType; // ok to use the same pizzaType?
	private String crustType;
	

	// Set the type to cheese via the constructor body.
	public MABCheese()
	{
	  this.pizzaType = "cheese";
	} //end constructor body 
	
	//********************************************************************************************************************************
	
	// setCrust() – (notice this is different from LiFiPizza setCurst method)
	public void setCrust()
	{
	// o Automatically set it to “Thin” crust, no option to change, sorry.
		this.crustType = "Thin";
	} //  end setCrust
	
	//********************************************************************************************************************************
} // end MABCheese
