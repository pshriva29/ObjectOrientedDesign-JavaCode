package myclasses;

public class Date
{
 private int month,day,year;

public int getMonth()
{
	return month;
}

public void setMonth(int month)
{
	this.month = month;
}

public int getDay()
{
	return day;
}

public void setDay(int day)
{
	this.day = day;
}

public int getYear()
{
	return year;
}

public void setYear(int year)
{
	if (year <= 20)
	{
	      year += 2000;
	}
	else if (year <= 99)
	{
	      year += 1900;
	}		
	   this.year = year;

}

public void setDate(int month, int day, int year) 
		{
		   setMonth( month );
		   setDay( day );
		   setYear( year );
		}

public Date( ) 
{
   setDate(1,1,2000);
}
public Date(int month, int day, int year)
{
   setDate( month, day, year );
}

public String toString( )
{
   return (getDay( ) < 10? "0": "") + 
      getDay( ) + "-" +
         strMonth( ) + "-" + getYear( );
}


public String strMonth( )
{
   String answer;
   switch ( getMonth( ) )
   {
      case  1: answer = "Jan"; break;
      case  2: answer = "Feb"; break;
      case  3: answer = "Mar"; break;
      case  4: answer = "Apr"; break;
      case  5: answer = "May"; break;
      case  6: answer = "Jun"; break;
      case  7: answer = "Jul"; break;
      case  8: answer = "Aug"; break;
      case  9: answer = "Sep"; break;
      case 10: answer = "Oct"; break;
      case 11: answer = "Nov"; break;
      case 12: answer = "Dec"; break;
      default: answer = "???";
   }  // end switch
   return answer;
}

public boolean isLeapYear( )
{
   int yr = getYear( );
   boolean answer;


   if (yr % 400 == 0)
      answer = true;
   else if (yr % 100 == 0)
      answer = false;
   else if (yr % 4 == 0)
      answer = true;
   else
      answer = false;


   return answer;
}


public int daysThisMonth( )
{
   int mo = getMonth( );
   int answer;


   if (mo == 4 || mo == 6 || mo == 9 || mo == 11)
   {
      answer = 30;
   }
   else
   {
	      if (mo == 2)
	      {
	         answer = (isLeapYear( )? 29 : 28);
	      }
	      else
	      {
	         answer = 31;
	      }
	   }


	   return answer;
	}


public void nextDay( ) 
{
   if ( getMonth( ) == 12 && getDay( ) == 31 )
      setDate(1, 1, getYear( ) + 1);
   else if ( getDay( ) == daysThisMonth( ) )
   {
      setMonth(getMonth( ) + 1);
      setDay(1);
   }
   else
      setDay(getDay( ) + 1);
}



}
