package myclasses;

public class Segment
{
  //Variable declaration
  private Point p1;
  private Point p2;
  
//Getters and setters
public Point getP1()
{
	return p1;
}
private void setP1(Point p1)
{
	this.p1 = p1;
}
public Point getP2()
{
	return p2;
}
private void setP2(Point p2)
{
	this.p2 = p2;
}


//Constructor with aggregation
public Segment(Point x,Point y)
{
   setP1(x);
   setP2(y);
}


//Constructor with composition
public Segment(int x1,int y1, int x2,int y2)
{
  Point p3 = new Point(x1,y1);
  Point p4 = new Point(x2,y2);
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
		
	if (!(obj instanceof Segment))
		return false;
    Segment seg1 = (Segment)obj; 
	
	return ( this.p1.equals(seg1.p1) && this.p2.equals(seg1.p2) );
}


}
