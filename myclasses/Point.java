package myclasses;

public class Point
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
  public Point( )
  {
     setPoint(0,0);
  }
	
  public Point(int x,int y)
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
  	if (!(obj instanceof Point))
  		return false;
  	Point point = (Point)obj; 
  	return ( this.x == point.x && this.y == point.y );
  }
  
  // equals method for int
  public boolean equals(int point1, int point2)
  {
  	return (this.x == point1 && this.y == point2);
  }

  
}
