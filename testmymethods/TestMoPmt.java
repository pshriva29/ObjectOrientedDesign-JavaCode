package testmymethods;

import java.text.DecimalFormat;

import mymethods.MyMethods;

public class TestMoPmt
{

	public static void main(String[] args)
	{      
		   //Variable declaration
		   double loan, aprAmt, moPmt;
		   int years;
		   
		   DecimalFormat twoDigits = new DecimalFormat("0.00");
		   
		   //Assignments
		   loan = 82900;
		   aprAmt = 0.095;
		   years = 15;
		   
           //Method call
		   moPmt = MyMethods.moPmt(loan, aprAmt, years);
		   
		   //Display
		   System.out.println("Loan amount = $"+twoDigits.format(loan));  
		   System.out.println("APR = "+ aprAmt);
		   System.out.println("Years = "+ years);
		   System.out.println("Monthly payment = $"+ twoDigits.format(moPmt));
		   
      }

}
