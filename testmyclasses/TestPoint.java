package testmyclasses;

import myclasses.Point;
import myclasses.Point2;

public class TestPoint
{

	public static void main(String[] args)
	{ 
		//Object p1 
		Point p1 = new Point( );
        System.out.println(p1.toString());
        
		//Object p1 by overloaded constructor
		Point p2 = new Point(2,1);
        System.out.println(p2.toString());
        
        //Test cases for up(), down(), left(), right() methods
        p2.up(2);
        System.out.println(p2.toString());
        p2.left(5);
        System.out.println(p2.toString());
        p2.down(1);
        System.out.println(p2.toString());
        p2.down(4);
        System.out.println(p2.toString());
        p2.right(1);
        System.out.println(p2.toString());
        p2.right(4);
        System.out.println(p2.toString());
        p2.up(2);
        System.out.println(p2.toString());
        p2.left(2);
        System.out.println(p2.toString());
		
        //Test cases for equals(obj) and equals(int,int) methods
        Point p3 = new Point(3,4);
        Point p4 = p3;
        Point p5 = new Point(2,1);
        
        p5.right(1);
        p5.down(4);
        p5.left(5);
        p5.up(7);
        p5.right(5);
        
        System.out.println(p3.equals(p4));  // true
        System.out.println(p5.equals(p3));  // true
        System.out.println(p5.equals(3,4)); // true
        System.out.println(p5.equals(2,1));  // false
        
        /*Test cases for clone method*/
        
        Point2 p6 = new Point2(2,3);
        Point2 p7 = p6.clone();
        System.out.println("p6 is "+p6.toString());
        System.out.println("p7 is "+p7.toString());
        System.out.println(p6 == p7);  // false
    	System.out.println(p6.equals(p7)); //true
    	
    	  p6.right(1);
    
     
       	System.out.println(p6.equals(p7)); //false
    	
        

   }

}
