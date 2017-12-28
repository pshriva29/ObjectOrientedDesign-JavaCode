package myclasses;

public class Segment2 implements Cloneable
{
  //Variable declaration
  private Point2 p1;
  private Point2 p2;
  
//Getters and setters
public Point2 getP1()
{
	return p1;
}
private void setP1(Point2 p1)
{
	this.p1 = p1;
}
public Point2 getP2()
{
	return p2;
}
private void setP2(Point2 p2)
{
	this.p2 = p2;
}


//Constructor with aggregation
public Segment2(Point2 x,Point2 y)
{
   setP1(x);
   setP2(y);
}


//Constructor with composition
public Segment2(int x1,int y1, int x2,int y2)
{
  Point2 p3 = new Point2(x1,y1);
  Point2 p4 = new Point2(x2,y2);
  setP1(p3);
  setP2(p4);
}

//toSring() method for display
public String toString()
	{
	   return getP1().toString()+"-"+getP2().toString();
	}

//Method to calculate length of the segment
public double length()
{
	int x1 = p1.getX();
	int x2 = p2.getX();
	int y1 = p1.getY();
	int y2 = p2.getY();
	
	double length =  Math.sqrt(Math.pow( x1-x2,2) + Math.pow( y1-y2,2));
	
	return length;
}

//equals method
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
		
	if (!(obj instanceof Segment2))
		return false;
    Segment2 seg1 = (Segment2)obj; 
	
	return ( this.p1.equals(seg1.p1) && this.p2.equals(seg1.p2) );
}

//clone method

public Segment2 clone()
{
	try
	{
	//  call Object.clone()
		Segment2 cloned = (Segment2)super.clone();
	//  clone mutable fields
	    cloned.p1 = (Point2)p1.clone();
	    cloned.p2 = (Point2)p2.clone();
		return cloned;
	}


	catch (CloneNotSupportedException cnse)
      	{
         		// shouldn't ever happen
         		System.err.println( cnse );
         		return null;
      	}

}


}
