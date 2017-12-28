package testmyclasses;

import myclasses.Date;

public class TestDate
{

	public static void main(String[] args)
	{
		 // test the default constructor
		   Date d1 = new Date();
		   System.out.println("d1 = " + d1);


		   // test the overloaded constructor
		   // force 2 digit year to 1900's
		   Date d2 = new Date(12, 31, 99);
		   System.out.println("d2 = " + d2);


		   // force 2 digit year to 2000's
		   Date d3 = new Date(2, 29, 8);
		   System.out.println("d3 = " + d3 );
		// and here's a four digit year
		   Date d4 = new Date(7, 4, 1776);
		   System.out.println("d4 = " + d4 );
		   
		// test next day method
			d1.nextDay( );
			System.out.println("Now d1 = " + d1 );
			d2.nextDay( );
			System.out.println("Now d2 = " + d2 );
			d3.nextDay( );
			System.out.println("Now d3 = " + d3 );
			d4.nextDay( );
			System.out.println("Now d4 = " + d4 );
			
			System.out.println( "days in d4 is " + d4.daysThisMonth() );
			System.out.println( "is d3 have leap year " + d3.isLeapYear() );
		   	   
	}

}
