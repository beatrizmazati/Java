/*****************************************************************************************************************************************************
 * MABPizza.java
 * 
 * Beatriz Mazati Anderson
 * 
 * This is one *MABUnit5Cg14.java (driver) class. This class operates the Meat pizza orders and contains accessor methods in case they are needed.
 *
 *****************************************************************************************************************************************************/

public class MABPizza 
{
  private String pizzaType;
  private double cost;
  private String crust;
  private String ingredient;
 
  //**********************************************************************

  // Default constructor should set pizzaType to Meat and cost to $5
  
   public MABPizza()
   {
	 this.pizzaType = "meat"; 
	 this.cost = 5.00;
   } // end constructor
  
  //**********************************************************************
   
  // set the pizza's crust
   
  public void setCrust(String crust) 
  {
    this.crust = crust;
  } // end setPizzaType
  
  //***********************************************************************
  
  public String getCrust()
  {
	return this.crust;
  }
  
  //***********************************************************************
  //set the pizza's ingredient
  
  public void setIngredients(String ingredient)
  {
	 this.ingredient = ingredient;
  } // end setIngredient
  
  //***********************************************************************
  
  public String getIngredients() // should it be only ingredient?
  {
	return this.ingredient;
  }
  
  //***********************************************************************
  // add $2 to the initial cost
  
  public void setCost()
  {
	this.cost = this.cost + 2.00;
  } // end setCost
  
  //************************************************************************
  
  public double getCost() 
  {
	return this.cost;
  }
 } // end class
