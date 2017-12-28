package loops;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Statistics
{

	public static void main(String[] args)
	{
      int observation=0, sum=0, min=0, max=0, count=1;
      double mean = 0;
      String userInput, results;
      String result1=null;
      String result2=null;
      String result4="* * * * * * * * * * *"+"\n";
      String result5 = null;
      
      DecimalFormat twoDigits = new DecimalFormat("0.00");
      
      userInput = JOptionPane.showInputDialog("Enter observation #"+count + " (or \"end\" to quit)" );
      if(!(userInput.equalsIgnoreCase("end")))
      {
       min = Integer.parseInt(userInput);
      
       while(!(userInput.equalsIgnoreCase("end")))
    	{
    	 observation = Integer.parseInt(userInput);
    	 
    	 if (observation>max)
    	  {
    	   max = observation;
    	  }
    	  if(observation<min)
    	  {
    	   min = observation;
    	  }
          sum = sum+observation;
    	  count++;
          userInput = JOptionPane.showInputDialog("Enter observation #"+count + " (or \"end\" to quit)" );
          if(count==2 && (userInput.equalsIgnoreCase("end")))
    	  {
    		  result5="You entered the following observation:"+"\n"+observation;
    	  }
    	  else if(count==2)
    	  {
    		  result5="You entered the following observations:"+"\n"+observation;
    	  }
    	  else
    	  {
    		  result5=result5.concat("\n"+observation);
    	  }
    	  
    	 }
    	  
    	  count--;
    	  
          mean = sum / (float)count;
          mean = Math.round((mean)*100)/100.0;
     
    	  if(count==1)
    	  {
    		  result1="You entered "+count+" observation."+"\n";
              result2="The minimum is "+observation+"."+"\n"+"The maximum is "+observation+"."+"\n"+
            		         "The sum is "+observation+"."+"\n"+"The mean is "+ twoDigits.format(mean)+"."+"\n";
    		  results=result1.concat(result2).concat(result4).concat(result5);
    		  // show results on screen
    		  JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
    		  
    	  }
          else
    	  {   
    		   result1="You entered "+count+" observations."+"\n";
    		   result2="The minimum is "+min+"."+"\n"+"The maximum is "+max+"."+"\n"+
     		         "The sum is "+sum+"."+"\n"+"The mean is "+twoDigits.format(mean)+"."+"\n";
    		  results=result1.concat(result2).concat(result4).concat(result5);
    		// show results on screen
    		  JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
    	  }
         }
      
         else
         {
    	  results="No observations entered.";
          // show results on screen
          JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
         }

}
}
