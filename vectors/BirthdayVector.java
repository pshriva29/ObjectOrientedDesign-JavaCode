package vectors;
import java.util.Enumeration;
import java.util.Vector;

import myclasses.Birthday;
import myclasses.Date;

import javax.swing.JOptionPane;

public class BirthdayVector
{

	public static void main(String[] args)
	{
		String userInput,results=null;
		int i;
		boolean found = false;
		Vector<Birthday> bday = new Vector<Birthday>();

		//Creating Birthday objects
		bday.addElement(new Birthday("Bill",new Date(11,8,56)));
		bday.addElement(new Birthday("Cheryl",new Date(11,25,56)));
		bday.addElement(new Birthday("William",new Date(6,30,82)));
		bday.addElement(new Birthday("Cora",new Date(7,23,84)));
		bday.addElement(new Birthday("Hannah",new Date(6,26,88)));
		bday.addElement(new Birthday("Emma",new Date(4,11,90)));
		
		//Printing
		for (i = 0; i < bday.size(); i++)
		{
		    System.out.println( bday.elementAt(i) );
		}
		
	      //Ask user to enter a name to delete
		  userInput = JOptionPane.showInputDialog("Enter name to delete" );
		  for(i=0;i<bday.size();i++)
		  {
		  if (bday.elementAt(i).getName().equalsIgnoreCase(userInput))
				  {results = bday.elementAt(i).toString();
				   JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
			       System.out.println("Removing "+bday.elementAt(i).getName()+".");
			       bday.removeElementAt(i);
			       found = true;
                  }
	      }
	
	     if(!found)
		  { 
			  results = userInput+" not found";
			  JOptionPane.showMessageDialog( null, results, "Results",JOptionPane.PLAIN_MESSAGE );
		  }
	
		  //Size and Capacity
		  System.out.println( "There are " + bday.size() + " birthdays." );
			
		  System.out.println( "There is room for " + (bday.capacity()-bday.size()) +" entries." );
			
		  //Insert element in front of the list
		  bday.insertElementAt(new Birthday("Mom",new Date(1,6,39)), 0);
			
		  System.out.println( "Adding "+ bday.elementAt(0).getName()+" to the front of the list." );
			
		  System.out.println( "Now there are " +bday.size() + " birthdays." );
			
          System.out.println( "There is room for " +(bday.capacity() - bday.size()) + " entries." );
			
          //Print values by Enumeration
		  Enumeration<Birthday> enumer1 = bday.elements();
				while ( enumer1.hasMoreElements())
				{   
				    Birthday birthday = (Birthday)enumer1.nextElement(); 
				    System.out.println(birthday);
				}

        }

}
