package money;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TotalDue
{

	public static void main(String[] args)
	{
	 //variable declaration
		
     int quantity;
     double  price,discount,totalDueBefore, discountAmt, totalDueAfter;
     String userInput;
     String results;
     
     DecimalFormat twoDigits = new DecimalFormat("0.00");
     
     //Get User Input
     userInput = JOptionPane.showInputDialog("Enter quantity sold" );
     quantity = Integer.parseInt(userInput);
     
     userInput = JOptionPane.showInputDialog("Enter price each" );
     price = Double.parseDouble(userInput);
     
     userInput = JOptionPane.showInputDialog("Enter discount rate as a decimal" );
     discount = Double.parseDouble(userInput);
   

     // Perform Calculations
     
     totalDueBefore = quantity*price;
     discountAmt=Math.round((discount*totalDueBefore)*100)/100.0;
     totalDueAfter=totalDueBefore-discountAmt;
    
     //format results for display
     
     results = "Total due before discount is $"+twoDigits.format(totalDueBefore) + "\n" +
        		"Discount Amount is $"+ twoDigits.format(discountAmt) + "\n" +
        		"Total Due after discount is $"+ twoDigits.format(totalDueAfter) +"**";

      // show results on screen
      JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );

      // Exit 
      System.exit(0);
}

}
