package decisions;

import javax.swing.JOptionPane;

public class LoveLifeAdvisor2
{

	public static void main(String[] args)
	{
	 //Variables Declaration
     int myAge, dateAge, income, ageDifference ;
     
     String userInput;
     String results1 = "Ask out...and good luck!";
     String results2 = "May be you should find someone else...";
     
     userInput = JOptionPane.showInputDialog("How old is your prospective date?" );
     dateAge = Integer.parseInt(userInput);
     
     //Check conditions for the date
     
     /*Adding condition for 16 and 17*/
     if(dateAge==16 || dateAge==17 )
     {
    	 userInput = JOptionPane.showInputDialog("How old are you?" );
    	 myAge = Integer.parseInt(userInput);
    	 if(myAge==dateAge)
    	 {
    		 JOptionPane.showMessageDialog( null, results1, "Results",JOptionPane.INFORMATION_MESSAGE );
    	 }
    	 
    	 else
         {
          // show results
          JOptionPane.showMessageDialog( null, results2, "Results",JOptionPane.WARNING_MESSAGE);
         }
    	 
     }
     
     else if(dateAge>=18)
     {
       userInput = JOptionPane.showInputDialog("How old are you?" );
       myAge = Integer.parseInt(userInput);
       ageDifference = myAge - dateAge;
       
       if(Math.abs(ageDifference) <=20) 
       {
    	//show results  
        JOptionPane.showMessageDialog( null, results1, "Results",JOptionPane.INFORMATION_MESSAGE );
       }
     
       else
       {
        userInput = JOptionPane.showInputDialog("What is your prospective date's income?" );
        income = Integer.parseInt(userInput);
        if(income>=200000)
         {
          // show results
          JOptionPane.showMessageDialog( null, results1, "Results",JOptionPane.INFORMATION_MESSAGE );
         }
        else
         {
          // show results
          JOptionPane.showMessageDialog( null, results2, "Results",JOptionPane.WARNING_MESSAGE);
         }
        }
       }
   
     else
     {
      // show results
      JOptionPane.showMessageDialog( null, results2, "Results",JOptionPane.WARNING_MESSAGE);
     } 
    }

}
