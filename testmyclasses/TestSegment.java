package testmyclasses;

import myclasses.Point;
import myclasses.Point2;
import myclasses.Segment;
import myclasses.Segment2;

public class TestSegment
{

	public static void main(String[] args)
	{  
		//Objects of Point class 
		Point A = new Point(2,3);
		Point B = new Point(2,0);
	    Point C = new Point(2,-2);
		Point D = new Point(-3,-2);
		Point E = new Point(-2,0);
		
		//Objects of Segment class using constructor with aggregation
		Segment AB = new Segment(A,B);
		Segment AD = new Segment(A,D);
		Segment AE = new Segment(A,E);
		Segment BE = new Segment(B,E);    
		
		System.out.println("Segment ab: "+AB.toString());
		System.out.println("Segment ad: "+AD.toString());
		System.out.println("Segment ae: "+AE.toString());
		System.out.println("Segment be: "+BE.toString());
		
		
		//Test cases for length()
		System.out.println("Length of ab is "+AB.length());
		System.out.println("Length of ad is "+AD.length());
		System.out.println("Length of ae is "+AE.length());
		System.out.println("Length of be is "+BE.length());
		
		//Objects of Segment class constructor with composition
	    Segment ab1 = new Segment(3,4,1,2);
	    System.out.println("Segment ab1: "+ab1.toString());
	    System.out.println("Length of ab1 is "+ab1.length());
	    
	    //Test Cases for equals() method
	    Point F = new Point(2,3);
	    Segment cf = new Segment(C,F);
	    System.out.println(cf.equals(AB));//false
	    
	    Point G = new Point(2,3);
		Point H = new Point(2,0);
		Segment gh = new Segment(G,H);

        System.out.println(gh.equals(AB));//true
        
        /*Test cases for clone*/
    	Point2 I = new Point2(2,3);
		Point2 J = new Point2(2,0);
		
		Segment2 IJ = new Segment2(I,J);
		Segment2 KL = IJ.clone();
		
		
	
	        System.out.println(IJ == KL);  // false
	        System.out.println(IJ.equals(KL)); //true
	
	    	I.up(4);
	    	J.up(4);
	    	
	    	System.out.println(IJ.getP1().equals(KL.getP1()));//false
	    	System.out.println(IJ.getP2().equals(KL.getP2()));//false
	    	System.out.println(IJ.equals(KL)); //false
	    	System.out.println("Length of IJ is "+IJ.length());
			System.out.println("Length of KL is "+KL.length());
			
			I.left(3);
			
			System.out.println("Length of IJ is "+IJ.length());
			System.out.println("Length of KL is "+KL.length());
	    	
   }

}
