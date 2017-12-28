package mymethods;

public class MyMethods
{
   //Variables for Sphere
   static double volume, surfaceArea;
   //Variable for Loan
   static double moPmt;
   
   
   //Method to calculate Volume of Sphere
   public static double sphereVolume(double radius)
   {
	   volume = (1.0f*4/3)*(Math.PI)*(Math.pow(radius,3));
       return volume;
   }
   
   //Method to calculate Surface Area of Sphere
   public static double sphereArea(double radius)
   {
	   surfaceArea = 4*(Math.PI)*(Math.pow(radius,2));
	   return surfaceArea;
   }
   
   //Method to calculate Monthly payment
   public static double moPmt(double loan, double apr, int years )
   {
	   moPmt = loan/((1-(Math.pow((1+(apr/12)),(-(years*12)))))/(apr/12));
	   return moPmt;
   }
   
}
