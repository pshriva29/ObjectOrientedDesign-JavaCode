package money;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;



public class MakeChange
{

	public static void main(String[] args)
	{
	 //variable declaration
		
     int quarters,dimes,nickels,pennies;
     double  dollar;
     String userInput;
     String results;

     
     //Get User Input
     
     userInput = JOptionPane.showInputDialog("Enter the total value" );
     dollar = Double.parseDouble(userInput);
     
     // Calculations

     quarters = ((int)(dollar*100))/25;
     int mod = ((int) (dollar*100))%25;
     
     dimes = ((int)mod)/10;
     mod = ((int)mod)%10;
     
     nickels = ((int)mod)/5;
     mod =((int)mod)%5;
     
     pennies = mod;
    
      //format results for dispaly
       
      results="The correct change for $"+dollar+ " is " +"\n"+ quarters +" quarters, " + dimes 
        		+" dimes, " + nickels + " nickels," +"\n"+ "and " +pennies +" pennies." ;

      // show results on screen
     JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );

      // Exit
    System.exit(0);
	}
}
