package gettingstarted;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Credits
{

	public static void main(String[] args)
	{
		 DecimalFormat twoDigits = new DecimalFormat("0.00");
		/*
          System.out.println( "1 is "+9 / 2 );

          System.out.println( "2 is "+9 % 2 );


          System.out.println( 1.0f * (9 / 2) );//1.0f*4=4.0

          System.out.println( 1.0f * 9 / 2 ); //9.0/2=4.5


          System.out.println( "5 is "+9 / 2 * 1.0f );//


          System.out.println("6 is " +9 / (2 * 1.0f) );//

          System.out.println( (float) 9 / 2 );

          System.out.println( (float) (9 / 2 ) );

          System.out.println( 9 / (float) 2 );
          
          JOptionPane.showMessageDialog(null, "Plain Message",
        		  "Message",
        		  JOptionPane.PLAIN_MESSAGE);

         */
		
		System.out.println(Math.round((56.1976)*100)/100.0);
		
		System.out.println(twoDigits.format(56.1925));
	}

}
