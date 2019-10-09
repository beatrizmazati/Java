/**********************************************************************************************************
 * *MABUnit7Ch17.java
 *
 * Beatriz Mazati Anderson
 *
 * This program displays a dialog box show a message and a randomly chosen color. This random color is
 * to be used as the background color of a JFrame window which should appear after “OK” is selected. The 
 * window should ask your name and thank you for playing once “Enter” is pressed.   
 **********************************************************************************************************/
import javax.swing.*;  // JFrame and JButton 
import java.awt.*; //  FlowLayout, Color and Container
import java.awt.event.*; // For actionListener and ActionEvent
import java.util.*; // functions "random"

public class MABUnit7Ch17 extends JFrame
{
  private JTextField nameBox; // holds user name
  private JLabel nameSpace; // holds the initial and final phrases
  private String backgroundColor; // holds the background color of the window "Color Changing Frame"

  //********************************************************************************************************

  public MABUnit7Ch17(String randomColor) // parameter received & stored variable 
  {
    setTitle ("Color Changing Frame");
    setSize (510,205); 
    setLayout (new FlowLayout ());
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    backgroundColor = randomColor;
    createContents();
    setVisible(true);
  } // end constructor

  //*********************************************************************************************************

  // let`s now create the Label that will be randomized
  private void createContents()
  {
	nameSpace = new JLabel("What is your name?");
	nameBox = new JTextField(20);
	add(nameSpace);
	add(nameBox);
	nameBox.addActionListener(new Listener());
	
    switch (backgroundColor) // switch statement will assign the colors and label
    {
      case "GREEN":
    	getContentPane().setBackground(Color.GREEN);
    	nameSpace.setForeground(Color.BLUE);
        break;
      case "RED":
        getContentPane().setBackground(Color.RED);
        nameSpace.setForeground(Color.WHITE);
        break;
      case "WHITE":
    	getContentPane().setBackground(Color.WHITE);
    	nameSpace.setForeground(Color.BLACK);
    	break;
      case "BLUE":
    	getContentPane().setBackground(Color.BLUE);
    	nameSpace.setForeground(Color.WHITE);
        break;
      case "YELLOW":
    	getContentPane().setBackground(Color.YELLOW);
    	nameSpace.setForeground(Color.BLACK);
    	break;
	} // end switch
  } // end createContents

	//*****************************************************************************************************
	//event handling
  private class Listener implements ActionListener
  {
     public void actionPerformed(ActionEvent e)
	 {
       String message;
	   message = "Thanks for playing " + nameBox.getText();
	   nameBox.setVisible(false);
	   nameSpace.setText(message); // change the name prompt to thank you message
	  } //end action Performed
  } // end class Listener
	
	//******************************************************************************************************
	
  public static void main (String [] args)
  {
	int colorIndex; // hold a random index between 0 and 4
	String randomColor; // holds the chosen random color from the array
	String[] colors = {"RED", "WHITE", "BLUE", "YELLOW", "GREEN"};
	Random random = new Random();
	colorIndex = random.nextInt(colors.length); // this statement chose the random color = length = 4 in this case (0-4)
	randomColor = colors[colorIndex];
	 
	MABUnit7Ch17 mabFrame =  new MABUnit7Ch17(randomColor); // constructor call
	JOptionPane.showMessageDialog(mabFrame, "The following window color will be randomly chosen from" +
	"\nRed, White, Yellow, Green, Blue" + "\n\nYour color will be:  " + randomColor ); // random color still must be worked on 
  } // end main
} // end class
