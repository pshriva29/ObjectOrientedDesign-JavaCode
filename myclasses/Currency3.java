package myclasses;

public class Currency3 implements Cloneable
{
	//Variable declaration
 private int dollars;
 private int cents;

 
//Getters and setters
 
public int getDollars()
{
	return dollars;
}
private void setDollars(int dollars)
{  
	this.dollars = dollars;
	
}
public int getCents()
{
	return cents;
}
private void setCents(int cents)
{   
	if(cents<=99)
	{
	this.cents = cents;
	}
	else
	{
		dollars = dollars + (cents/100);
		this.cents = cents%100;
	}
}
 
//Set amount
public void setAmount(int newDollars,int newCents )
{
	setDollars(newDollars);
	setCents(newCents);
	
}

//Constructors
public Currency3( )
{
	setCents(0);
	setDollars(0);
}

public Currency3(int dollars,int cents)
{
	setAmount(dollars,cents);
}

//toSring() method for display
public String toString()
	{
     return "$"+getDollars()+"." + (getCents()<10 ? "0"+getCents() : getCents());
	}


//Add returns an object
public Currency3 add(int dollars,int cents)
{
	
	int newDollars = getDollars()+dollars;
	int newCents = getCents()+cents;
	setAmount(newDollars,newCents);

    return this;
}

//Check zero
public boolean isZero()
{
	return getDollars()==0 && getCents()==0 ? true : false;
}

// equals method for object
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (!(obj instanceof Currency3))
		return false;
	Currency3 currency = (Currency3)obj; 
	return ( this.getDollars() == currency.getDollars() && this.getCents() == currency.getCents() );
}


//  clone() method
public Currency3 clone() 
    {
	   try
	     {
		   return (Currency3)super.clone();
	     }
	  catch (CloneNotSupportedException cnse)
       {
         	// shouldn't ever happen
         		System.err.println( cnse );
         		return null;
       }
    }



}
