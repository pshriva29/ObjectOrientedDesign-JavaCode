package money;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CountChange
{

	public static void main(String[] args)
	{
     //variable declaration
		
     int quarters,dimes,nickels,pennies;
     double  dollar;
     String userInput;
     String results;
     DecimalFormat twoDigits = new DecimalFormat("0.00");
     
     //Get User Input
     userInput = JOptionPane.showInputDialog("How many quarters?" );
     quarters = Integer.parseInt(userInput);
     
     userInput = JOptionPane.showInputDialog("How many dimes?" );
     dimes = (int)Double.parseDouble(userInput);
     
     userInput = JOptionPane.showInputDialog("How many nickels?" );
     nickels = Integer.parseInt(userInput);
     
     userInput = JOptionPane.showInputDialog("How many pennies?" );
     pennies = Integer.parseInt(userInput);
     
     // Calculations for the result
     dollar= (quarters*.25)+(dimes*.1)+(nickels*.05)+(pennies*.01);
    
     //format results for display
     results = "Total value of "+ quarters + " quarters, " + dimes + " dimes, " + "\n" +
        		nickels + " nickels,and " + pennies + " pennies is " + "$" + twoDigits.format(dollar);
        

      // show results
      JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );

      // Exit
      System.exit(0);
	}

}
