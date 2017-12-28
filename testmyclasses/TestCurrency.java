package testmyclasses;

import myclasses.Currency;
import myclasses.Currency2;
import myclasses.Currency3;

public class TestCurrency
{

	public static void main(String[] args)
	{   
		//Objects of Currency class 
		Currency c = new Currency(8,205);
		Currency cNew = new Currency();
		
		//Display 
		System.out.println("c is " +c.toString());
		System.out.println("cNew is " + cNew.toString());
		
		//Test Cases for add() method
		c.add(2, 0);
		System.out.println("c is " +c.toString());
		c.add(5, 99);
		System.out.println("c is " + c.toString());
		
		cNew.add(0, 20);
		System.out.println("cNew is " + cNew);
		cNew.add(0, 99);
		System.out.println("cNew is  " + cNew);
		
		//Test Cases for isZero() method
		System.out.println("isZero() for c is " + c.isZero());
	    System.out.println("isZero() for cNew is " + cNew.isZero());
		
		//Test Case for isZero() method with 0 dollars
		Currency cNew1 = new Currency(0,50);
		System.out.println("isZero() for cNew1 is " + cNew1.isZero());
		
		//Test Case for isZero() method with 0 cents
		Currency cNew2 = new Currency(50,0);
		System.out.println("isZero() for cNew2 is " + cNew2.isZero());
		
		System.out.println("*********Testing of Currency3 start***************");
		
		//equals method of Currency3
		Currency3 c3 = new Currency3(8,205);
		Currency3 c4 = new Currency3(8,205);
		Currency3 c5 = new Currency3(5,205);
		System.out.println("c3 is " + c3.toString());
		System.out.println("c3 and c4 equals is " + c3.equals(c4)); //true
		System.out.println("c3 and c5 equals is " + c3.equals(c5)); //false
		
		//clone method of Currency3
		
		Currency3 c6 = c3.clone();
		System.out.println("c3 and c6 equals is " + c3.equals(c6)); //true
		
		//add method of Currency3
		c3.add(2,0);
		System.out.println("c3 is " +c3.toString());
		
		c3.add(5,99);
		System.out.println("c3 is " + c3.toString());
		
		//testing cloned object after add method   
		System.out.println("c3 and c6 equals is " + c3.equals(c6)); //false
		
		System.out.println("*********Testing of Currency2 start***************");
		
		
		Currency2 c2 = new Currency2(8,205);
		Currency2 cNew3 = new Currency2();
		
		//Display 
		System.out.println("c2 is " +c2.toString());
		System.out.println("cNew2 is " + cNew3.toString());
		
		c2.add(2, 0);
		System.out.println("c2 is " +c.toString());
		//c2.add(5, 99);
		//System.out.println("c2 is " + c.toString());
		
		
		
		
		
		
		
		
		
		
	}

}
