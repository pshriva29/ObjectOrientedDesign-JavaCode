package exceptions;

public class TopOfLadderException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	public TopOfLadderException()
	{
		this("You are already at the top.");
	}
	
	 public TopOfLadderException(String str)
	 {
		 
		 super(str);
     }
  
}
