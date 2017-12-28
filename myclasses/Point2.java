package myclasses;

public class Point2 implements Cloneable
{
  //Variable declaration
  private int x, y;
  
  // Getters and setters
  public int getX()
  {
  	return x;
  }

  private void setX(int x)
  {
  	this.x = x;
  }

  public int getY()
  {
  	return y;
  }

  private void setY(int y)
  {
  	this.y = y;
  }
  
  //Set coordinates
  public void setPoint(int newX,int newY)
  {
	  setX(newX);
	  setY(newY);
  }
  
  //Constructors
  public Point2( )
  {
     setPoint(0,0);
  }
	
  public Point2(int x,int y)
  {
     setPoint(x,y);
  }

  //toSring() method for display
  public String toString()
	{
	   return "("+getX()+","+getY()+")";
	}
  
  // up,down,left,right methods
  public void up(int i)
  {
	  y = y+i;
  }

  public void down(int i)
  {
	  y = y-i;
  }
  
  public void left(int i)
  
  {
	  x = x-i;
  }
  
  public void right(int i)
  {
	  x = x+i;
  }
  
  // equals method for object
  public boolean equals(Object obj)
  {
  	if (this == obj)
  		return true;
  	if (!(obj instanceof Point2))
  		return false;
  	Point2 point = (Point2)obj; 
  	return ( this.x == point.x && this.y == point.y );
  }
  
  // equals method for int
  public boolean equals(int point1, int point2)
  {
  	return (this.x == point1 && this.y == point2);
  }

  
  //  clone() method
  public Point2 clone() 
      {
  	   try
  	     {
  		   return (Point2)super.clone();
  	     }
  	  catch (CloneNotSupportedException cnse)
         {
           	// shouldn't ever happen
           		System.err.println( cnse );
           		return null;
         }
      }

  
}
