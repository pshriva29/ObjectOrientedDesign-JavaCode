package loops;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Bowling3
{

	public static void main(String[] args)
	{
		// declare variables
       int pins, pinsSum, gameCount=1;
       double avg;
       
       
       String userInput, results;
       DecimalFormat twoDigits = new DecimalFormat("0.00");

    /*
       // initialize scores (as if input by user)
       game1 = 142;
       game2 = 158;
       game3 = 164;

       // calculations
       pins = game1 + game2 + game3;
       avg = pins / 3;

       // show results
*/
       userInput = JOptionPane.showInputDialog("Enter Score for game #" + gameCount+ " or -1 to quit");
       pins = Integer.parseInt(userInput);
       pinsSum = pins;
       if(pins>-1)
       {
         while (pins!=-1)
          {gameCount++;
    	   userInput = JOptionPane.showInputDialog("Enter Score for game #" + gameCount+ " or -1 to quit");
           pins = Integer.parseInt(userInput);
           gameCount--;
           if(pins!=-1)
           {
        	   gameCount++;
               pinsSum = pinsSum+pins;
           }
           }
           avg = pinsSum / (float)gameCount;
    	   System.out.println("average"+avg);
    	
           avg = Math.round((avg)*100)/100.0;
           System.out.println("average"+avg);
   
           results = "Total Pins = "+pinsSum+"\n"+"\n"+"Average = "+twoDigits.format(avg);

          // show results on screen
          JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
       
        }
        else{
    	   results = "You have entered no scores.";
    	   JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
        }
		// get outta here



		System.exit(0);
	}

}
