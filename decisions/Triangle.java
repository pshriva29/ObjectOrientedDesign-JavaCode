package decisions;

import javax.swing.JOptionPane;

public class Triangle
{

	public static void main(String[] args)
	{
	  //Variables Declaration
      int first, second, third, shortest, middle=0, longest=0, sumOfSides=0 ;
      String triangleType;
      String userInput, results;
      
      userInput = JOptionPane.showInputDialog("Enter first length" );
      first = Integer.parseInt(userInput);
      userInput = JOptionPane.showInputDialog("Enter second length" );
      second = Integer.parseInt(userInput);
      userInput = JOptionPane.showInputDialog("Enter third length" );
      third = Integer.parseInt(userInput);
      
      if(first>second)
      {
    	longest = first;
    	middle = second;
      }
      else
      {
    	longest = second ;
    	middle = first;
      }
      if(third>longest)
      {
    	shortest = middle;
    	middle = longest;
    	longest= third;
      }
      else
      {
    	if(third>middle)
    	  {
    		shortest= middle;
    		middle=third;
    	  }
    	else
    	  {
    		shortest=third;
    	  }
      }
         
      sumOfSides = shortest + middle;
      
      if(sumOfSides > longest)
      {   if((shortest==middle) && (shortest == longest))
          {
    	   triangleType = "n equilateral";
          }
          else if((shortest==middle) || (shortest==longest) || (middle==longest))
          {
           triangleType = "n isosceles";
          }
          else if ((shortest * shortest) + (middle * middle) == (longest * longest))  
    	  {
           triangleType = " right scalene";
          }
          else
          {
           triangleType = " scalene";
          }
          
          //set results
          results="You gave me: "+ first + ", " + second + ", " +
                   third +"\n" + "\n"+ "In order: "+shortest+", "+middle+", " +
    		       longest+"\n"+"\n"+ "You can make a" +triangleType+ "\n"+ "triangle with these sides.";

          // show results on screen
          JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
      }
      
      else
      {
    	//set results
        results="You gave me: "+ first + ", " + second + ", " + third +"\n" + "\n"+ "In order: "+shortest+", "+middle+", " +
    		  longest+"\n"+"\n"+ "You cannot make a" + "\n"+ "triangle with these sides.";

        //show results on screen
       JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
      }
     }
    }
