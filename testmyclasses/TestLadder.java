package testmyclasses;
import java.util.Scanner;
import myclasses.Ladder;
import exceptions.BottomOfLadderException;
import exceptions.TopOfLadderException;

public class TestLadder
{

	private static Scanner in;
	private static Scanner in2;

	public static void main(String[] args)
	{
       Ladder ladder = new Ladder();
     
       in = new Scanner(System.in);
       System.out.print("Step (U)p, Step (D)own, or (Q)uit? ");
       String userInput = in.next();
       
       while(!(userInput.equalsIgnoreCase("Q")))
          {   
            if(userInput.equalsIgnoreCase("U"))
    	    {
    		  try
				{   
			      ladder.stepUp();
				  System.out.println (ladder.toString());
                } 
				catch (TopOfLadderException e)
				{   
				  System.out.println (e);
				  System.out.println (ladder.toString());
                }
	         }
    	   
    	   if(userInput.equalsIgnoreCase("D"))
    	   {
             try
				{   
                  ladder.stepDown();
				  System.out.println (ladder.toString());
                }
				catch (BottomOfLadderException e)
				{
                 System.out.println (e);
				 System.out.println (ladder.toString());
                }
           }
        else if((!(userInput.equalsIgnoreCase("u"))) && (!(userInput.equalsIgnoreCase("d"))) && (!(userInput.equalsIgnoreCase("q"))))
    	   {  
    		   System.out.println ("Bad entry. Try again.");
    		 
           }
    	   
    	   in2 = new Scanner(System.in);
           System.out.print("Step (U)p, Step (D)own, or (Q)uit? ");
           userInput = in2.next();
         }
      
        if(userInput.equalsIgnoreCase("Q"))
       {   
    	   System.out.println ("Good bye.");
       }
       
       
    	   
	}

}
