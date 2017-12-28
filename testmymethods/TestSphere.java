package testmymethods;

import java.text.DecimalFormat;

import mymethods.MyMethods;

public class TestSphere
{

	public static void main(String[] args)
	{
      //Variable declaration
	  double radius, volume, surfaceArea;
   
	  DecimalFormat twoDigits = new DecimalFormat("0.00");
      //Assignments
      radius=2.4;
      
      
      //Method call
      volume = MyMethods.sphereVolume(radius);
      surfaceArea = MyMethods.sphereArea(radius);
      
      //Display
      System.out.println("The given radius is "+ radius);  
      System.out.println("The volume of the sphere is "+ twoDigits.format(volume));
      System.out.println("The area of the sphere is "+ twoDigits.format(surfaceArea));
      
     }

}
